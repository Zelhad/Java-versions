package javaVersionsCores;

public class AgreementItemRef {

	private String id;
	private String href;
	private String agreementItemId;
	private String name;
	private String baseType;
	private String  schemaLocation; 
	private String   type; 
	private String referredType;
	
	public AgreementItemRef() {
		
	}

	public AgreementItemRef(String id, String href, String agreementItemId, String name, String baseType,
			String schemaLocation, String type, String referredType) {
		this.id = id;
		this.href = href;
		this.agreementItemId = agreementItemId;
		this.name = name;
		this.baseType = baseType;
		this.schemaLocation = schemaLocation;
		this.type = type;
		this.referredType = referredType;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public String getAgreementItemId() {
		return agreementItemId;
	}

	public void setAgreementItemId(String agreementItemId) {
		this.agreementItemId = agreementItemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBaseType() {
		return baseType;
	}

	public void setBaseType(String baseType) {
		this.baseType = baseType;
	}

	public String getSchemaLocation() {
		return schemaLocation;
	}

	public void setSchemaLocation(String schemaLocation) {
		this.schemaLocation = schemaLocation;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getReferredType() {
		return referredType;
	}

	public void setReferredType(String referredType) {
		this.referredType = referredType;
	}

	@Override
	public String toString() {
		return "AgreementItemRef [id=" + id + ", href=" + href + ", agreementItemId=" + agreementItemId + ", name="
				+ name + ", baseType=" + baseType + ", schemaLocation=" + schemaLocation + ", type=" + type
				+ ", referredType=" + referredType + "]";
	}
	
	

}
