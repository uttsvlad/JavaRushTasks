package com.javarush.task.task35.task3513;

import java.awt.*;

public class Tile {
    int value;

    public Tile() {
        this.value = 0;
    }

    public Tile(int value) {
        this.value = value;
    }

    public boolean isEmpty() {
        return value == 0;
    }

    public Color getFontColor() {
        int colorCode;
        if (value < 16)
            colorCode = 0x776e65;
        else
            colorCode = 0xf9f6f2;
        return new Color(colorCode);
    }

    public Color getTileColor() {
        int colorCode;

        switch (value) {
            case 0:
                colorCode = 0xcdc1b4;
                break;
            case 2:
                colorCode = 0xeee4da;
                break;
            case 4:
                colorCode = 0xede0c8;
                break;
            case 8:
                colorCode = 0xf2b179;
                break;
            case 16:
                colorCode = 0xf59563;
                break;
            case 32:
                colorCode = 0xf67c5f;
                break;
            case 64:
                colorCode = 0xf65e3b;
                break;
            case 128:
                colorCode = 0xedcf72;
                break;
            case 256:
                colorCode = 0xedcc61;
                break;
            case 512:
                colorCode = 0xedc850;
                break;
            case 1024:
                colorCode = 0xedc53f;
                break;
            case 2048:
                colorCode = 0xedc22e;
                break;
            default:
                colorCode = 0xff0000;
        }
        return new Color(colorCode);
    }
}
