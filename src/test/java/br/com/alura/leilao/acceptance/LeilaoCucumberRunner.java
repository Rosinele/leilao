package br.com.alura.leilao.acceptance;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) //Na versão jUnit 5 usa-se o "Extends"
@CucumberOptions(features = "classpath:features")
public class LeilaoCucumberRunner {

}
