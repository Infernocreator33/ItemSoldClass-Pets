package items;

public class PetSold extends ItemSold
{
    private boolean beenVaccinated;
    private boolean beenNeutered;
    private boolean beenHousebroken;
    
    public boolean getBeenVaccinated()
    {
        return beenVaccinated;
    }
    public void setBeenVaccinated(boolean beenVaccinated)
    {
        this.beenVaccinated = beenVaccinated;
    }
    public boolean getBeenNeutered()
    {
        return  beenNeutered;
    }
    public void setBeenNeutered(boolean beenNeutered)
    {
        this.beenNeutered = beenNeutered;
    }
    public boolean getBeenHousebroken()
    {
        return beenHousebroken;
    }
    public void setBeenHousebroken(boolean beenHousebroken)
    {
        this.beenHousebroken = beenHousebroken;
    }
}
