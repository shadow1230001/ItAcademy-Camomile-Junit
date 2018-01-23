package by.dbarkova.logic;

import by.dbarkova.bean.Bud;
import by.dbarkova.bean.Flower;
import by.dbarkova.bean.Leaf;

public class BotanicEncyclopedia {

    public void printFlowerInfo(Flower flower) {

        if (flower != null) {
            System.out.println("Title: " + flower.getTitle());
            System.out.println("Bud size, color: " + flower.getBud().getSize() + ", " + flower.getBud().getColor());
            System.out.println("Stem height, width: " + flower.getStem().getHeight() + ", " + flower.getStem().getWidth() + "\n");
            printLeaves(flower.getBud());
        }

    }

    private void printLeaves(Bud bud) {

        Leaf[] leaves = bud.getLeaves();
        if (bud != null && bud.getLeaves() != null) {
            for (Leaf leaf : leaves) {
                if (leaf != null) {
                    System.out.println("leaf color, shape: " + leaf.getColor() + ", " + leaf.getShape());
                } else {
                    System.out.println("The leaf has fallen");
                }
            }
        } else if (bud != null) {
            System.out.println("Leaves still not appear");
        }


    }

}
