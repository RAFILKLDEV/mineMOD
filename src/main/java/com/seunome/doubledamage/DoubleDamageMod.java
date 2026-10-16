package com.seunome.doubledamage;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod("doubledamage")
public class DoubleDamageMod {
    public DoubleDamageMod() {
        // Registra esta instância para ouvir eventos
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onLivingHurt(LivingHurtEvent event) {
        // Pega o dano original e dobra
        float original = event.getAmount();
        event.setAmount(original * 2f);
    }
}
