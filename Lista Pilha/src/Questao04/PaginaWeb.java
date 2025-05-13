package Questao04;

public class PaginaWeb {
    
    private String url;

    public PaginaWeb(String url) {
        this.url = url;
    }

    public PaginaWeb() {
        this.url = "";
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
