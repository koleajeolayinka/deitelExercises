package tddClass;

public class tkPowerBike {


    private boolean TurnOn;
    private boolean TurnOff;
    private int accelerated;
    private int decelerated;

    public void setTurnOn(){
        this.TurnOn=true;
    }

    public boolean getTurnOn() {return true;
    }

    public void setTurnOff() {
        this.TurnOff=false;

    }

    public boolean getTurnOff() {return false;
    }

    public void setAccelerated() {
        this.accelerated= accelerated + 1;
    }

    public int getAccelerated() {return accelerated;
    }

    public void setDecelerate() {
        this.decelerated = accelerated - 1;
    }

    public int getDecelerated() {
        return decelerated;
    }


    public void gearOneAccelerated() {this .accelerated = accelerated +1;
    }

    public void gearTwoAccelerated() {this.accelerated = accelerated +1;
    }

    public void gearThreeAccelerated() {this.accelerated = accelerated +1;
    }

    public void gearFourAccelerated() {this.accelerated = accelerated +1;
    }
  //*  if (accelerated <= 0-20)
}
