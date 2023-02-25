public class Laptops {
    int ram;
    int hardDrive;
    float cpuFrequency;
    float screenDiagonal;
    String brand;
    String os;

    @Override
    public String toString() {
        return String.format("Laptop %s, %.1f\" screen, CPU: %.2f GHz, %dGB, %dGB RAM, %s", brand, screenDiagonal, cpuFrequency, hardDrive, ram, os);
    }

    public int getRam(){
        return ram;
    }

    public int getHardDrive(){
        return hardDrive;
    }

    public float getCpuFrequency(){
        return cpuFrequency;
    }

    public float getScreenDiagonal(){
        return screenDiagonal;
    }

    public String getBrand(){
        return brand;
    }

    public String getOs(){
        return os;
    }
}
