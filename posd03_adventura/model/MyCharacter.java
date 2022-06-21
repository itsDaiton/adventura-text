package model;

/**
 * Třída MyCharacter je pomocná třída pro boj s nepřáteli v příkazu "bojuj".
 * Obsahuje pouze metody pro "přepravu" dat. 
 * 
 * @author David Poslušný
 * @version LS 2020
 */
public class MyCharacter
{
    private int healthPoints; //životy hráče

    /**
     * Konstruktor třídy MyCharacter
     * Použe se nastavují defaultní životy na 250.
     */
    public MyCharacter() {
        healthPoints = 250;
    }

    /**
     * Metoda getHealthPoints vrací aktuální životy hráče při boji.
     *
     * @return healthPoints Aktuální hodnota životů
     */
    public int getHealthPoints() {
        return healthPoints;
    }

    /**
     * Methtoda setHealthPoints nastavuje života hráče na novou hodnotu zadanou v parametru.
     *
     * @param healthPoints Nová hodnota životů
     */
    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
}
