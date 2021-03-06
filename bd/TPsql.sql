-- MySQL Script generated by MySQL Workbench
-- 04/27/16 07:45:19
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Loja`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Loja` (
  `Codigo` INT NOT NULL COMMENT '',
  `Nome` VARCHAR(45) NOT NULL COMMENT '',
  PRIMARY KEY (`Codigo`)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Vendas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Vendas` (
  `Codigo` INT NOT NULL COMMENT '',
  `Quantidade` INT NOT NULL COMMENT '',
  `PrecoVenda` VARCHAR(45) NULL COMMENT '',
  `Loja_Codigo` INT NOT NULL COMMENT '',
  PRIMARY KEY (`Codigo`)  COMMENT '',
  INDEX `fk_Vendas_Loja1_idx` (`Loja_Codigo` ASC)  COMMENT '',
  CONSTRAINT `fk_Vendas_Loja1`
    FOREIGN KEY (`Loja_Codigo`)
    REFERENCES `mydb`.`Loja` (`Codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Fornecedor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Fornecedor` (
  `Codigo` INT NOT NULL COMMENT '',
  `Nome` VARCHAR(50) NOT NULL COMMENT '',
  `Cidade` VARCHAR(50) NULL COMMENT '',
  PRIMARY KEY (`Codigo`)  COMMENT '');


-- -----------------------------------------------------
-- Table `mydb`.`Produto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Produto` (
  `Codigo` INT NOT NULL COMMENT '',
  `Descricao` (255) NOT NULL COMMENT '',
  PRIMARY KEY (`Codigo`)  COMMENT '');


-- -----------------------------------------------------
-- Table `mydb`.`Compra`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Compra` (
  `Codigo` INT NOT NULL COMMENT '',
  `PrecoCompra` DECIMAL(2,6) NULL COMMENT '',
  `Fornecedor_Codigo`  NOT NULL COMMENT '',
  PRIMARY KEY (`Codigo`)  COMMENT '',
  INDEX `fk_Compras_Fornecedor1_idx` (`Fornecedor_Codigo` ASC)  COMMENT '',
  CONSTRAINT `fk_Compras_Fornecedor1`
    FOREIGN KEY (`Fornecedor_Codigo`)
    REFERENCES `mydb`.`Fornecedor` (`Codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`ItemCompra`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`ItemCompra` (
  `Compras_Codigo` INT NOT NULL COMMENT '',
  `Produto_Codigo`  NOT NULL COMMENT '',
  PRIMARY KEY (`Compras_Codigo`, `Produto_Codigo`)  COMMENT '',
  INDEX `fk_Compras_has_Produto_Produto1_idx` (`Produto_Codigo` ASC)  COMMENT '',
  INDEX `fk_Compras_has_Produto_Compras1_idx` (`Compras_Codigo` ASC)  COMMENT '',
  CONSTRAINT `fk_Compras_has_Produto_Compras1`
    FOREIGN KEY (`Compras_Codigo`)
    REFERENCES `mydb`.`Compra` (`Codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Compras_has_Produto_Produto1`
    FOREIGN KEY (`Produto_Codigo`)
    REFERENCES `mydb`.`Produto` (`Codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`ItemVenda`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`ItemVenda` (
  `Produto_Codigo` INT NOT NULL COMMENT '',
  `Vendas_Codigo` INT NOT NULL COMMENT '',
  `qtde` INT NOT NULL COMMENT '',
  PRIMARY KEY (`Produto_Codigo`, `Vendas_Codigo`)  COMMENT '',
  INDEX `fk_Produto_has_Vendas_Vendas1_idx` (`Vendas_Codigo` ASC)  COMMENT '',
  INDEX `fk_Produto_has_Vendas_Produto1_idx` (`Produto_Codigo` ASC)  COMMENT '',
  CONSTRAINT `fk_Produto_has_Vendas_Produto1`
    FOREIGN KEY (`Produto_Codigo`)
    REFERENCES `mydb`.`Produto` (`Codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Produto_has_Vendas_Vendas1`
    FOREIGN KEY (`Vendas_Codigo`)
    REFERENCES `mydb`.`Vendas` (`Codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


-- -----------------------------------------------------
-- Table `mydb`.`Estoque`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Estoque` (
  `Produto_Codigo` INT NOT NULL COMMENT '',
  `Loja_Codigo` INT NOT NULL COMMENT '',
  `qtde` INT NULL COMMENT '',
  PRIMARY KEY (`Produto_Codigo`, `Loja_Codigo`)  COMMENT '',
  INDEX `fk_Produto_has_Loja_Loja1_idx` (`Loja_Codigo` ASC)  COMMENT '',
  INDEX `fk_Produto_has_Loja_Produto1_idx` (`Produto_Codigo` ASC)  COMMENT '',
  CONSTRAINT `fk_Produto_has_Loja_Produto1`
    FOREIGN KEY (`Produto_Codigo`)
    REFERENCES `mydb`.`Produto` (`Codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Produto_has_Loja_Loja1`
    FOREIGN KEY (`Loja_Codigo`)
    REFERENCES `mydb`.`Loja` (`Codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
