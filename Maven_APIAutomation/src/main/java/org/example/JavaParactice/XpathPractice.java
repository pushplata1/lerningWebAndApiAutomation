package org.example.JavaParactice;

public class XpathPractice {

    public  static String dynamicXpath(String Product_Rating){

        //String xpath="//h2[@aria-label='"+Product_Rating+"']/../../..//div[@data-cy='reviews-block']//a/span";

        String xpath1="//div[@data-cy='title-recipe']//span[contains(text(),'"+Product_Rating+"')]/../../../..//span[@class='a-price']/span[@class]";


        return xpath1;
    }

    public static void main(String[] args) {

      String xpath= dynamicXpath("Casa De Amor Organic Cow Manure- NPK & Micro Nutrients, Compost, Plant Food for Organic Gardening- 900 gm");
        System.out.println(xpath);

        ////div[@data-cy='title-recipe']//a[@target='_blank']//span

    }
}
