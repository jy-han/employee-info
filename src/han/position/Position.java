package han.position;
/**
 * 职务类
 * @author fan
 * 描述职务信息：职务编号、职务名称
 */
public class Position {
	//职务属性：职务编号、名称
	private int positionNo;
	private String positionName;
	
	public Position(){
	}
	
	public Position(int positionNo, String positionName){
		this.setPositionNo(positionNo);
		this.setPositionName(positionName);
	}

	public String getPositionNo() {
		return "P"+positionNo;
	}

	//设定职位编号范围：0～30之间
	public void setPositionNo(int positionNo) {
		if(positionNo < 0 || positionNo > 30)
			positionNo = 0;
		else
			this.positionNo = positionNo;
	}

	public String getPositionName() {
		return positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}
}
