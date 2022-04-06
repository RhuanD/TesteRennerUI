package com.br.renner.runners;

import com.br.renner.testcases.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//utilizaria aqui o Cucumber para rodar o BDD.
@RunWith(Suite.class)
@Suite.SuiteClasses(
    {
            CompraPrintedChiffonDress.class,
            CompraFadedSleeveTShirt.class,
            CompraBlouse.class,
            CompraPrintedDress.class,
            CompraComCadastro.class
    }
)
public class TestRunner {
    @BeforeClass
    public static void setUp(){
        //aqui eu inicializo os reports
    }

    @AfterClass
    public static void shutDown(){
        //aqui eu finalizo os reports
    }
}