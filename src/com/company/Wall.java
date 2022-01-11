package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Wall implements Structure,CompositeBlock{
    private List<ObjectBlock> blocks;

    public void setBlocks(List<ObjectBlock> blocks) {
        this.blocks = blocks;
    }

    @Override
    public List<ObjectBlock> getBlocks() {
        return blocks;
    }

    @Override
    public Optional<ObjectBlock> findBlockByColor(String color) {
        ObjectBlock temp = new ObjectBlock("","");
        for (ObjectBlock obj : blocks){
            if(obj.getColor().toLowerCase().equals(color.toLowerCase())){
                temp = obj;
                break;
            }
        }
        return Optional.ofNullable(temp);
    }

    @Override
    public List<ObjectBlock> findBlocksByMaterial(String material) {
        List<ObjectBlock> temp = new ArrayList<>();
        for(ObjectBlock obj: blocks){
            if(obj.getMaterial().toLowerCase().equals(material.toLowerCase())){
                temp.add(obj);
            }
        }
        return temp;
    }

    @Override
    public int count() {
        return blocks.size();
    }


}
