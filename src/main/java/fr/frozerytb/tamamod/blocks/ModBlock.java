package fr.frozerytb.tamamod.blocks;

import net.minecraft.block.Block;

import net.minecraft.block.material.Material;

public class ModBlock extends Block
{

    public ModBlock(String name, Material materialIn) {
        
        super(materialIn);
        SetUnlocalizedName(name);
        setRegistryName(name);
    }

    private void SetUnlocalizedName(String name) {
    }
}
