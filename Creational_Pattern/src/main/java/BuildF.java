
public class BuildF{

	public String weight;
	public int screen_size;
	public int  cam_front,cam_back;
	public String os;
	int battery;
	int storage;
	int processor;
		public BuildF setWeight(String weight) {
		this.weight = weight;
		return(this);
	}
	public BuildF setScreen_size(int screen_size) {
		this.screen_size = screen_size;
		return(this);
	}
	public BuildF setCam_front(int cam_front) {
		this.cam_front = cam_front;
		return(this);
	}
	public BuildF setCam_back(int cam_back) {
		this.cam_back = cam_back;
		return(this);
	}
	public BuildF setOs(String os) {
		this.os = os;
		return(this);
	}
	public BuildF setBattery(int battery) {
		this.battery = battery;
		return(this);
	}
	
	public BuildF setStorage(int storage) {
		this.storage = storage;
		return(this);
	}
		public BuildF setProcessor(int processor) {
		this.processor = processor;
		return(this);
	}
		public Fea getall()
		{
			return  new Fea(weight, screen_size,cam_front,cam_back,os,battery,storage,processor);
			
		}
}
