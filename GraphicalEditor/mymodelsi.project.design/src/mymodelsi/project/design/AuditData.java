package mymodelsi.project.design;
public class AuditData {
    public String getFileFormat(String filePath) {
        if (filePath != null) {
            int lastDotIndex = filePath.lastIndexOf('.');
            if (lastDotIndex != -1 && lastDotIndex < filePath.length() - 1) {
                return filePath.substring(lastDotIndex + 1).toLowerCase();
            }
        }
        return null;
    }  
}





