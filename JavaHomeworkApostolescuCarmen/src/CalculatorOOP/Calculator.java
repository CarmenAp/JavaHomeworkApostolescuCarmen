/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculatorOOP;

/**
 *
 * @author qqq
 */
public class Calculator {
    
    private Ecran screen = new Ecran("");   
    
    private Button button0 = new Button("0");
    private Button button1 = new Button("1");
    private Button button2 = new Button("2");
    private Button button3 = new Button("3");
    
    private Button button4 = new Button("4");
    
    private Button button5 = new Button("5");
    
    private Button button6 = new Button("6");
    
    private Button button7 = new Button("7");
    
    private Button button8 = new Button("8");

    private Button button9 = new Button("9");
    
    private Button buttonPlus = new Button("+");
    
    private Button buttonMinus = new Button("-");
    
    private Button buttonOr = new Button("*");
    
    private Button buttonDivide = new Button("/");
    
    private Button buttonEql = new Button("=");
    private Button buttonClear = new Button("C");
    
    private Processor procesor = new Processor();
    /**
     * Get the value of buttonEql
     *
     * @return the value of buttonEql
     */
    public Button getButtonEql() {
        return buttonEql;
    }

    /**
     * Set the value of buttonEql
     *
     * @param buttonEql new value of buttonEql
     */
    public void setButtonEql(Button buttonEql) {
        this.buttonEql = buttonEql;
    }

    
   

    /**
     * Get the value of procesor
     *
     * @return the value of procesor
     */
    public Processor getProcesor() {
        return procesor;
    }

    /**
     * Set the value of procesor
     *
     * @param procesor new value of procesor
     */
    public void setProcesor(Processor procesor) {
        this.procesor = procesor;
    }

    /**
     * Get the value of buttonClear
     *
     * @return the value of buttonClear
     */
    public Button getButtonClear() {
        return buttonClear;
    }

    /**
     * Set the value of buttonClear
     *
     * @param buttonClear new value of buttonClear
     */
    public void setButtonClear(Button buttonClear) {
        this.buttonClear = buttonClear;
    }

    /**
     * Get the value of buttonDivide
     *
     * @return the value of buttonDivide
     */
    public Button getButtonDivide() {
        return buttonDivide;
    }

    /**
     * Set the value of buttonDivide
     *
     * @param buttonDivide new value of buttonDivide
     */
    public void setButtonDivide(Button buttonDivide) {
        this.buttonDivide = buttonDivide;
    }

    /**
     * Get the value of buttonOr
     *
     * @return the value of buttonOr
     */
    public Button getButtonOr() {
        return buttonOr;
    }

    /**
     * Set the value of buttonOr
     *
     * @param buttonOr new value of buttonOr
     */
    public void setButtonOr(Button buttonOr) {
        this.buttonOr = buttonOr;
    }

    /**
     * Get the value of buttonMinus
     *
     * @return the value of buttonMinus
     */
    public Button getButtonMinus() {
        return buttonMinus;
    }

    /**
     * Set the value of buttonMinus
     *
     * @param buttonMinus new value of buttonMinus
     */
    public void setButtonMinus(Button buttonMinus) {
        this.buttonMinus = buttonMinus;
    }


    /**
     * Get the value of buttonPlus
     *
     * @return the value of buttonPlus
     */
    public Button getButtonPlus() {
        return buttonPlus;
    }

    /**
     * Set the value of buttonPlus
     *
     * @param buttonPlus new value of buttonPlus
     */
    public void setButtonPlus(Button buttonPlus) {
        this.buttonPlus = buttonPlus;
    }

    /**
     * Get the value of button9
     *
     * @return the value of button9
     */
    public Button getButton9() {
        return button9;
    }

    /**
     * Set the value of button9
     *
     * @param button9 new value of button9
     */
    public void setButton9(Button button9) {
        this.button9 = button9;
    }

    /**
     * Get the value of button8
     *
     * @return the value of button8
     */
    public Button getButton8() {
        return button8;
    }

    /**
     * Set the value of button8
     *
     * @param button8 new value of button8
     */
    public void setButton8(Button button8) {
        this.button8 = button8;
    }

    /**
     * Get the value of button7
     *
     * @return the value of button7
     */
    public Button getButton7() {
        return button7;
    }

    /**
     * Set the value of button7
     *
     * @param button7 new value of button7
     */
    public void setButton7(Button button7) {
        this.button7 = button7;
    }

    
    /**
     * Get the value of button6
     *
     * @return the value of button6
     */
    public Button getButton6() {
        return button6;
    }

    /**
     * Set the value of button6
     *
     * @param button6 new value of button6
     */
    public void setButton6(Button button6) {
        this.button6 = button6;
    }

    /**
     * Get the value of button5
     *
     * @return the value of button5
     */
    public Button getButton5() {
        return button5;
    }

    /**
     * Set the value of button5
     *
     * @param button5 new value of button5
     */
    public void setButton5(Button button5) {
        this.button5 = button5;
    }

    /**
     * Get the value of button4
     *
     * @return the value of button4
     */
    public Button getButton4() {
        return button4;
    }

    /**
     * Set the value of button4
     *
     * @param button4 new value of button4
     */
    public void setButton4(Button button4) {
        this.button4 = button4;
    }

    /**
     * Get the value of button3
     *
     * @return the value of button3
     */
    public Button getButton3() {
        return button3;
    }

    /**
     * Set the value of button3
     *
     * @param button3 new value of button3
     */
    public void setButton3(Button button3) {
        this.button3 = button3;
    }


    /**
     * Get the value of button2
     *
     * @return the value of button2
     */
    public Button getButton2() {
        return button2;
    }

    /**
     * Set the value of button2
     *
     * @param button2 new value of button2
     */
    public void setButton2(Button button2) {
        this.button2 = button2;
    }

    /**
     * Get the value of button1
     *
     * @return the value of button1
     */
    public Button getButton1() {
        return button1;
    }

    /**
     * Set the value of button1
     *
     * @param button1 new value of button1
     */
    public void setButton1(Button button1) {
        this.button1 = button1;
    }

    /**
     * Get the value of button0
     *
     * @return the value of button0
     */
    public Button getButton0() {
        return button0;
    }

    /**
     * Set the value of button0
     *
     * @param button0 new value of button0
     */
    public void setButton0(Button button0) {
        this.button0 = button0;
    }


    /**
     * Get the value of screen
     *
     * @return the value of screen
     */
    public Ecran getScreen() {
        return screen;
    }

    /**
     * Set the value of screen
     *
     * @param screen new value of screen
     */
    public void setScreen(Ecran screen) {
        this.screen = screen;
    }

}
