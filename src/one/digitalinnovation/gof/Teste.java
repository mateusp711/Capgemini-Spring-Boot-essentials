package one.digitalinnovation.gof;

import one.digitalinnovation.gof.Singleton.SingletonEager;
import one.digitalinnovation.gof.Singleton.SingletonLazy;
import one.digitalinnovation.gof.Singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.Strategy.*;
import one.digitalinnovation.gof.facade.Facade;

public class Teste {

    //singleton

    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager Eager = SingletonEager.getInstancia();
        System.out.println(Eager);
        Eager = SingletonEager.getInstancia();
        System.out.println(Eager);

        SingletonLazyHolder LazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(LazyHolder);
        LazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(LazyHolder);

        //strategy

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();
        robo.mover();

        //facade

        Facade facade = new Facade();
        facade.migrarCliente("Venilton", "13403129");

            }
        }


