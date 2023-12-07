package service;

import dto.House;

public class MainClass
{
    static void printStr (Object str)
    {
        System.out.println("str : "+ str.toString());
    }
    public static void main(String[] args)
    {
        House woodHouse = new House();
        woodHouse.setMaterials("Дерево");

        woodHouse.setMaterials("Дерево");

        /* я такой фанат этого числа, что готов писать сочинение прям в коде */
        dto.House ss = new dto.House();

        Double ss1 = 10.2;
        if(ss1.equals(10.4))
        {

        }
        printStr("byteRef+bytePrim");
    }

}
