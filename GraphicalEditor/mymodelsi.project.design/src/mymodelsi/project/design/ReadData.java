package mymodelsi.project.design;
import org.eclipse.emf.ecore.EObject;

import mLmodel.Cycle;
import mLmodel.Data_Understanding;
import mLmodel.Process;
public class ReadData {
    public String mm1(EObject self) {
        if (self instanceof Process) {
            return ((Process) self).getFile_path();
        }

        if (self instanceof Cycle) {
            EObject container = ((Cycle) self).eContainer();
            while (container != null && !(container instanceof Process)) {
                container = container.eContainer();
            }

            if (container instanceof Process) {
            	Process process = (Process) container;
                return process.getFile_path();
            }
        }
        
        if (self instanceof Data_Understanding) {
            EObject container = ((Data_Understanding) self).eContainer();
            while (container != null && !(container instanceof Process)) {
                container = container.eContainer();
            }

            if (container instanceof Process) {
            	Process process = (Process) container;
                return process.getFile_path();
            }
        }
        


        return null;
    }
}
