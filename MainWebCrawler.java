package web.webcrawler;

public class MainWebCrawler {

	public static void main(String[] args) {
		
		new WebCrawlerWithDepth().getPageLinks("https://www.youtube.com/",0);
	}

}
