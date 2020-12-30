import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

public class helloTagServlet implements Tag {
	private PageContext pageContext;
	private Tag parentTag;
	
	public void setPageContext(PageContext pageContext) {
		this.pageContext = pageContext;
	}
	
	public void setParent(Tag parentTag) {
		this.parentTag = parentTag;
	}
	
	public Tag getParent() {
		return this.parentTag;
	}
	
	public int doStartTag() throws JspException {
		//try内がJSPからtaglibディレクトリを指定したい際に行う処理
		try {
			JspWriter out = pageContext.getOut();
			out.print("hello world");
		} catch(Exception e) {
			throw new JspException(e.getMessage());
		}
		return SKIP_BODY;
	}
	
	public int doEndTag() throws JspException {
		//doStartTagが終了し際に行われる処理
		return EVAL_PAGE;
	}
	
	public void release() {}

}
