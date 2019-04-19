package app.IWasToldThereWouldBeNoMath;

public class NotNoMathWorker {

    private int width;
    private int heigth;
    private int length;

    // Manual First Thoughts

    // I don't know if this is done.

    public int getSmallestSide(int l, int w, int h){
        int smallestSide = 0;

        //find largest length and return multiplication of other 2 (smaller)  if 0, then either number would work,
        // so arbitrary is ok.

        if(((2 * l) -h - w ) > 0){ // L is larger than both
            smallestSide = h * w;
        }
        else if (((2 * h) - l - w) > 0){ // H is larger than both
            smallestSide = l * w;
        }

        else { // Either W is larger than both or they are all the same, either way, l* h will be correct in this case
            smallestSide = l * h;
        }

        return smallestSide;
    }


    public int calculateSurfaceArea(int w, int h, int l){
        int surfaceArea = 0;
        surfaceArea = (2*((w*h) + (w*l) + (h * l)));
        return surfaceArea;
    }

    public int figureOutHowMuch(int w, int h, int l){
        int neededWrappingPaper = 0;

        neededWrappingPaper = calculateSurfaceArea(w, h, l) + getSmallestSide(w, h, l);



        return neededWrappingPaper;
    }

}
