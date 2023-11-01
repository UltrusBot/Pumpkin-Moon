package me.ultrusmods.pumpkinmoon.client.model;

import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.render.entity.model.EntityModelPartNames;
import net.minecraft.client.render.entity.model.ZombieEntityModel;
import net.minecraft.entity.mob.ZombieEntity;

public class SplinterlingEntityModel<SplinterlingEntity extends ZombieEntity> extends ZombieEntityModel<SplinterlingEntity> {
    public SplinterlingEntityModel(ModelPart modelPart) {
        super(modelPart);
    }

    public static TexturedModelData getTexturedModelData(Dilation dilation) {
        ModelData modelData = BipedEntityModel.getModelData(dilation, 0.0F);
        var head = modelData.getRoot().getChild(EntityModelPartNames.HEAD);
        ModelPartData splinters = head.addChild("splinters", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        splinters.addChild("cube_r1", ModelPartBuilder.create().uv(0, 20).cuboid(-1.0F, -10.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, 0.0F, -0.4919F, 1.0798F, 0.0111F));
        splinters.addChild("cube_r2", ModelPartBuilder.create().uv(0, 20).cuboid(-1.0F, -10.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, 0.0F, 0.4651F, 0.2757F, 0.9132F));
        splinters.addChild("cube_r3", ModelPartBuilder.create().uv(0, 20).cuboid(-1.0F, -10.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, 0.0F, -0.8916F, 0.5161F, -0.4574F));
        splinters.addChild("cube_r4", ModelPartBuilder.create().uv(0, 20).cuboid(-1.0F, -10.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, 0.0F, -0.1499F, 0.5161F, -0.4574F));
        splinters.addChild("cube_r5", ModelPartBuilder.create().uv(0, 20).cuboid(-1.0F, -10.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, 0.0F, 0.5681F, 1.2997F, 0.4814F));
        splinters.addChild("cube_r6", ModelPartBuilder.create().uv(0, 20).cuboid(-1.0F, -10.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, 0.0F, 0.5117F, 0.3122F, 0.3026F));
        splinters.addChild("cube_r7", ModelPartBuilder.create().uv(0, 20).cuboid(-1.0F, -10.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, 0.0F, -0.3363F, 0.0653F, -0.6459F));
        splinters.addChild("cube_r8", ModelPartBuilder.create().uv(0, 20).cuboid(-1.0F, -10.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, 0.0F, -0.262F, 0.223F, -0.1408F));
        splinters.addChild("cube_r9", ModelPartBuilder.create().uv(0, 20).cuboid(-1.0F, -10.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, 0.0F, -0.0408F, -0.4446F, 0.6544F));
        splinters.addChild("cube_r10", ModelPartBuilder.create().uv(0, 20).cuboid(-1.0F, -10.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, 0.0F, 0.4166F, -0.1652F, -0.6552F));
        return TexturedModelData.of(modelData, 64, 64);
    }
}
