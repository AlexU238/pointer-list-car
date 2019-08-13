public class Chassis {
    private Wheel[] frontWheels;
    private Wheel[] backWheels;


    public Chassis(Wheel[] frontWheels, Wheel[] backWheels) {
        this.frontWheels = frontWheels;
        this.backWheels = backWheels;
    }

    void turn(String dir) {
        System.out.println("Front wheels turning " + dir);
    }

    void changeFrontWheel(int index, Wheel wheel) {
        frontWheels[index] = wheel;
    }

    void changeBackWheel(int index, Wheel wheel) {
        backWheels[index] = wheel;
    }

    void pumpAllTo(float p){
        for(Wheel fW: frontWheels){
            fW.pumpTo(p);
        }
        for(Wheel bW: backWheels){
            bW.pumpTo(p);
        }
    }

    void pumpToMax(){
        for(Wheel fW: frontWheels){
            fW.pumpToMax();
        }
        for(Wheel bW: backWheels){
            bW.pumpToMax();
        }
    }

    float getWheelPressure(){
        float pTmp=0;
        for(Wheel fW: frontWheels){
            pTmp=pTmp+fW.getPressure();
        }
        for(Wheel bW: backWheels){
            pTmp=pTmp+bW.getPressure();
        }
        return pTmp/(frontWheels.length+backWheels.length);
    }

    public Wheel[] getFrontWheels() {
        return frontWheels;
    }

    public void setFrontWheels(Wheel[] frontWheels) {
        this.frontWheels = frontWheels;
    }

    public Wheel[] getBackWheels() {
        return backWheels;
    }

    public void setBackWheels(Wheel[] backWheels) {
        this.backWheels = backWheels;
    }
}