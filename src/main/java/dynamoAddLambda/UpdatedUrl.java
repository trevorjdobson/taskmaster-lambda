package dynamoAddLambda;

public class UpdatedUrl {
    private String id;
    private String newUrl;

    public UpdatedUrl(){}
    public UpdatedUrl(String id, String newUrl){
        this.id = id;
        this.newUrl = newUrl;
    }
    public String getId(){
        return this.id;
    }
    public String getNewUrl(){
        return this.newUrl;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNewUrl(String newUrl) {
        this.newUrl = newUrl;
    }
}
