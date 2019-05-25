package product;

import com.opensymphony.xwork2.ActionSupport;
import java.io.File;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.ServletRequestAware;

public class EditProductAction extends ActionSupport implements ServletRequestAware {
    String oldproid,proid,catid,proname,prodesc,progender,protype;
    int proprice;
    File proimg;
    String s="";
    String filePath;
    String  p;
    
    
    private HttpServletRequest servletRequest;
    private String proimgFileName;
    private String proimgContentType;

    public String getOldproid() {
        return oldproid;
    }

    public void setOldproid(String oldproid) {
        this.oldproid = oldproid;
    }
   
    public String getProid() {
        return proid;
    }

    public void setProid(String proid) {
        this.proid = proid;
    }

    public String getCatid() {
        return catid;
    }

    public void setCatid(String catid) {
        this.catid = catid;
    }

    public String getProgender() {
        return progender;
    }

    public void setProgender(String progender) {
        this.progender = progender;
    }
    
    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }

    public String getProdesc() {
        return prodesc;
    }

    public void setProdesc(String prodesc) {
        this.prodesc = prodesc;
    }

    public int getProprice() {
        return proprice;
    }

    public void setProprice(int proprice) {
        this.proprice = proprice;
    }

    public String getProtype() {
        return protype;
    }

    public void setProtype(String protype) {
        this.protype = protype;
    }
    
    

    public File getProimg() {
        return proimg;
    }

    public void setProimg(File proimg) {
        this.proimg = proimg;
    }

    public String getProimgFileName() {
        return proimgFileName;
    }

    public void setProimgFileName(String proimgFileName) {
        this.proimgFileName = proimgFileName;
    }

    public String getProimgContentType() {
        return proimgContentType;
    }

    public void setProimgContentType(String proimgContentType) {
        this.proimgContentType = proimgContentType;
    }
    
    @Override
    public void setServletRequest(HttpServletRequest servletRequest) {
        this.servletRequest=servletRequest;
    }
    
    
    
    @Override
    public String execute() throws IOException{
       
        try {
            filePath = servletRequest.getSession().getServletContext().getRealPath("/").concat("uploads");
            System.out.println("Server path:" + filePath);
            
            File fileToCreate =new File(filePath,this.proimgFileName);
            File fileToCreate0 = new File("uploads", this.proimgFileName);
            FileUtils.copyFile(this.proimg, fileToCreate);
            p=fileToCreate0.getPath();
            } 
        catch (Exception e) {
            return INPUT;
            }
 
        boolean b=EditProduct.edit(oldproid,proid,catid,proname,prodesc,proprice,p,progender,protype);
        if(b){
            s=SUCCESS;
        }
        else{
            s=ERROR;
        }
        return s;
    }
    
    
    @Override
    public void validate(){
        boolean d=AddProduct.productexist(proid);
     if(getProid().equals("") || getProid()==null){
          addActionError("Product ID Empty");
     }
     else if(getCatid().equals("")|| getCatid()==null){
         addActionError("Category Empty");
     }
     else if(getProname().equals("")||getProname()==null){
         addActionError("Product Name Empty");
     }
     else if(getProdesc().equals("")||getProdesc()==null){
         addActionError("Product Description Empty");
     }
     else if(getProgender().equals("")||getProgender()==null){
         addActionError("Product Gender Empty");
     }
      else if(getOldproid().equals("")||getOldproid()==null){
         addActionError("Old Product ID Empty");
     }
     else if(d==false){
         addActionError("Product Does Not Exist");
     }
    }
    
}
