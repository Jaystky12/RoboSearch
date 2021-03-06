// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package nl.vu.cs.simbad.lab;

public class Navigator extends Observer {
	
	private CentralStation centralstation;
	private Driver driver;
	private Photographer photographer;
	
	public Navigator(CentralStation cs, Driver d, Photographer p){
		this.centralstation = cs;
		this.driver = d;
		this.photographer = p;
	}
	
	@Override
	public void Update(){
		if(this.centralstation.getState() == 4){
			this.driver.setAngle((this.photographer.getBestPhoto() - 1) * 0.628318531);
			this.centralstation.setState(5);
		}else{}
	}
};
