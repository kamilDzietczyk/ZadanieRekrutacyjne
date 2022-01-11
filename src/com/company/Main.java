package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<ObjectBlock> obj = new ArrayList<>();
        obj.add(new ObjectBlock("Yellow","Wood"));
        obj.add(new ObjectBlock("Blue","Granite"));
        obj.add(new ObjectBlock("Red","Ice"));
        obj.add(new ObjectBlock("Black","Glass"));
        obj.add(new ObjectBlock("Blue","Wood"));

        Wall w = new Wall();
        w.setBlocks(obj);
        //Zwraca listę wszystkich CompositeBlock
        System.out.println(w.getBlocks());

        //Zwraca listę obiektów
        int count = w.count();
        System.out.println(count);

        //Zwraca napotkany w liście obiekt o parametrze color
        w.findBlockByColor("Blue").get().getColor();
        System.out.println(w.findBlockByColor("Blue").get().getColor());

        //Zwraca Listę obiektów o parametrze materials
        System.out.println(w.findBlocksByMaterial("Wood").size());


    }
}
