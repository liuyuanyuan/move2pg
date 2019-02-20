package lyy.pg.orcl.controller.compare;

public class SchemaDTO {

	private long id;
	private String name;

	public SchemaDTO(long id, String name) {
		this.id = id;
		this.name = name;
	}
        
        @Override
	public String toString() {
		return name;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
