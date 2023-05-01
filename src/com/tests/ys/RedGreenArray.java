package com.tests.ys;

public class RedGreenArray {
    public RedGreenArray(int arrayLength) {
        this.elements = new redGreenElement[arrayLength];
        for(int i =0; i < arrayLength; i++){
            this.elements[i] = new redGreenElement(i);
        }
    }

/*    public RedGreenArray(redGreenElement[] arrayOfElements) {
        int arrayLength = arrayOfElements.length;
        this.elements = new redGreenElement[arrayLength];
        System.arraycopy(arrayOfElements, 0, this.elements, 0, arrayLength);

    }*/

    public RedGreenArray(redGreenEnum[] elements) {
        int arrayLength = elements.length;
        this.elements = new redGreenElement[arrayLength];
        for(int i = 0; i< arrayLength; i++){
            this.elements[i] = new redGreenElement(elements[i], i);
        }

    }

    public void setAt(int index, redGreenElement value){
        if(index < elements.length){
            elements[index] = value;
        }
        else throw new ArrayIndexOutOfBoundsException();
    }

    public redGreenElement getAt(int index){
        if(index < elements.length){
            return elements[index];
        }
        else throw new ArrayIndexOutOfBoundsException();
    }

    public final int getLenghth(){return elements.length; }

    public void sort() {
        int indexOfFirstRed = 0;
        int indexOfLastGreen = elements.length - 1;

        while (indexOfFirstRed < indexOfLastGreen){
            while (elements[indexOfFirstRed].color == redGreenEnum.green && indexOfFirstRed < indexOfLastGreen){
                indexOfFirstRed++;
            }
            while (elements[indexOfLastGreen].color == redGreenEnum.red && indexOfFirstRed < indexOfLastGreen){
                indexOfLastGreen--;
            }
            if(indexOfFirstRed >= indexOfLastGreen){break;}
            this.swap(indexOfFirstRed,indexOfLastGreen);
        }
    }
    public void print() {
        for(int i =0; i < elements.length; i++) {
            System.out.printf("%s, ", elements[i]);
        }
    }

    private final redGreenElement[] elements;
    private void swap(int indexOfFirstRed, int indexOfLastGreen) {
        redGreenElement placeHolder = elements[indexOfFirstRed];
        elements[indexOfFirstRed] = elements[indexOfLastGreen];
        elements[indexOfLastGreen] = placeHolder;
    }

}

