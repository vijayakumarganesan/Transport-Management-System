package connectionpackage;

public class Row {
	int row;
    public int getRow() {
		return row;
	}
	public int getSeason() {
		return season;
	}
	public int getSeries() {
		return series;
	}
	public String getCompany() {
		return company;
	}
	public String getDeal() {
		return deal;
	}
	public String getIndustory() {
		return industory;
	}
	public String getGender() {
		return gender;
	}
	public int getAmount() {
		return amount;
	}
	public String getEquity() {
		return equity;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public void setSeason(int season) {
		this.season = season;
	}
	public void setSeries(int series) {
		this.series = series;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void setDeal(String deal) {
		this.deal = deal;
	}
	public void setIndustory(String industory) {
		this.industory = industory;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public void setEquity(String equity) {
		this.equity = equity;
	}
	int season;
    int series;
    String company;
    String deal;
    String industory;
    String gender;
    int amount;
    String equity;
}
