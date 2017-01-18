//Kenneth Martínez 16976
//Gadhi Rodriguez 16206

package com.uvg;

/**
 * Created by kennek on 18/01/2017.
 */
public interface IRadio {

    default boolean status (boolean on){
        on = !on;
        return on;
    }

    default boolean frecuencia (boolean f){
        f = !f;
        return f;
    }

    default boolean limite (float emisora){
        boolean flag = true;
        if (emisora <= 107.9){
            flag = false;
        }
        return flag;
    }

    default float[] setEmisora(float[] emisoras, int index, float emisora){
        emisoras[index] = emisora;
    return emisoras;
    }

    default float getEmisora(float[] emisoras, int index){
        float emisora = emisoras[index];
        return emisora;

    }


}
