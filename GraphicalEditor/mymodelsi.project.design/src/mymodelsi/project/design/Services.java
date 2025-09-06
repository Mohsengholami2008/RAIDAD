package mymodelsi.project.design;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;


import mLmodel.Attribiutes_Type;
import mLmodel.Auto_Prep;
import mLmodel.Bar;
import mLmodel.CSV;
import mLmodel.Classification;
import mLmodel.Cluster_Evaluation;
import mLmodel.Clustering;
import mLmodel.Correlation;
import mLmodel.Cross_Validation;
import mLmodel.Cycle;
import mLmodel.Date_Comp;
import mLmodel.Date_to_Int;
import mLmodel.Day;
import mLmodel.Duplicates;
import mLmodel.Encoding;
import mLmodel.Excel;
import mLmodel.Fill_Value;
import mLmodel.Import_Data;
import mLmodel.KNN;
import mLmodel.KNN_Argumans;
import mLmodel.KNN_Imputer;
import mLmodel.Month;
import mLmodel.N_Neighbors;
import mLmodel.Normalization;
import mLmodel.Plots;
import mLmodel.Preprocess;
import mLmodel.Process;
import mLmodel.Regular;
import mLmodel.SVM;
import mLmodel.Set_Role;
import mLmodel.Simple_Imputer;
import mLmodel.Simple_Imputer_Arguments;
import mLmodel.Statistics;
import mLmodel.Strategy;
import mLmodel.Target;
import mLmodel.Varience;
import mLmodel.Visualization;
import mLmodel.Voting_Classifier;
import mLmodel.Year;
import mLmodel.OneHot;
import mLmodel.PCA;
import mLmodel.PCA_Argumans;
import mLmodel.Scaling;
import mLmodel.Scatter;
/**
 * The services class used by VSM.
 */
public class Services {
    


	/**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
      return self;
    }
    
    
 // Start TO Add Regular Data
    public EList<String> mmm1(CSV self) {
        EList<String> names = new BasicEList<>();

        EList<mLmodel.Set_Role> cc = self.getRole();

        for (mLmodel.Set_Role regular : cc) {
            names.add(regular.getName());
        }

        return names;
    }

    

    
    
    public EList<String> v22(EObject self) {
        ReadData aaa = new ReadData();
        String filepath = aaa.mm1(self);
        EList<String> columnNames = new BasicEList<>();
        if (filepath == null || filepath.isEmpty()) {
            return columnNames;
        }

        String csvFilePath = filepath;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            String line;
            if ((line = br.readLine()) != null) {
            	String[] variableTitles = line.split("[;,]");
                for (String title : variableTitles) {
                    columnNames.add(title);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return columnNames;
    }



    public EList<String> addregular(EObject self) {
        EList<String> columnNames = v22(self);

        EList<String> names = new BasicEList<>();

        EList<mLmodel.Set_Role> cc = ((Import_Data) self).getRole();

        int index = 0;
        for (mLmodel.Set_Role role : cc) {
            if (role instanceof Regular && index < columnNames.size()) {
                Regular regular = (Regular) role;
                regular.setName(columnNames.get(index));
                names.add(columnNames.get(index));
                index++;
            }
        }

        return names;
    }
    
    

    // END of Add Regular Data


    // Start Audit for variables in model and data set

    public EList<String> Att_name(CSV self) {
        EList<String> names = new BasicEList<>();

        EList<mLmodel.Set_Role> cc = self.getRole();

        for (mLmodel.Set_Role role : cc) {
            names.add(role.getName());
        }

        return names;
    }

    public boolean compareLists(EObject self) {
        EList<String> list1 = Att_name((CSV) self);

        EList<String> list2 = v22(self);

        Set<String> set1 = new HashSet<>(list1);
        Set<String> set2 = new HashSet<>(list2);

        if (set1.size() != set2.size()) {
            return false;
        }

        if (!set1.containsAll(set2) || !set2.containsAll(set1)) {
            return false;
        }

        return true;
    }

    
   
    
    public String getDifferentVariableTitles(EObject self) {
        EList<String> list1 = Att_name((CSV) self);
        EList<String> list2 = v22(self);

        Set<String> set1 = new HashSet<>(list1);
        Set<String> set2 = new HashSet<>(list2);

        Set<String> difference1 = new HashSet<>(set1);
        difference1.removeAll(set2);

        Set<String> difference2 = new HashSet<>(set2);
        difference2.removeAll(set1);

        Set<String> mergedDifferences = new HashSet<>();
        mergedDifferences.addAll(difference1);
        mergedDifferences.addAll(difference2);

        EList<String> differentTitles = new BasicEList<>(mergedDifferences);
        
        
        ReadData nameofpath = new ReadData();
        String filePath = nameofpath.mm1(self);      
        AuditData myformat = new AuditData();
        if (filePath != null) {
            String format = myformat.getFileFormat(filePath);
            if (self instanceof CSV && format != null && format.equalsIgnoreCase("csv")) {
                return "Different Variables are" + differentTitles; 
            } 

        }
        return "Data Can not Import"; 
    }
    

    // END Audit for variables in model and data set
    
    
    // Start Audit file path format
    public boolean filepathname(EObject self) {
        ReadData nameofpath = new ReadData();
        String filePath = nameofpath.mm1(self);      
        AuditData myformat = new AuditData();
        if (filePath != null) {
            String format = myformat.getFileFormat(filePath);
            if (self instanceof CSV && format != null && format.equalsIgnoreCase("csv")) {
                return true; 
            } else if (self instanceof Excel && format != null && (format.equalsIgnoreCase("xls") || format.equalsIgnoreCase("xlsx"))) {
                return true; 
            } else {
                return false; 
            }
        }
        return false; 
    }
    
    public boolean filepathnameprocess(Process self) {
        String filePath = self.getFile_path();      
        AuditData myformat = new AuditData();
        if (filePath != null) {
            String format = myformat.getFileFormat(filePath);
            if (format != null && format.equalsIgnoreCase("csv")) {
                return true; 
            } else if (format != null && (format.equalsIgnoreCase("xls") || format.equalsIgnoreCase("xlsx"))) {
                return true; 
            } else {
                return false; 
            }
        }
        return false; 
    }

    
    
    public boolean addcsv(Process self) {
        String filePath = self.getFile_path();      
        AuditData myformat = new AuditData();
        if (filePath != null) {
            String format = myformat.getFileFormat(filePath);
            if (format != null && format.equalsIgnoreCase("csv")) {
                return true; 
            } }
        return false; 
    }
    
    public boolean addExcel(Process self) {
        String filePath = self.getFile_path();      
        AuditData myformat = new AuditData();
        if (filePath != null) {
            String format = myformat.getFileFormat(filePath);
            if (format != null && (format.equalsIgnoreCase("xls") || format.equalsIgnoreCase("xlsx"))) {
                return true; 
            } }
        return false; 
    }
    
    
    // End Audit file path format

    
    // Audit check process has import data
    public boolean hasImportData(EObject self) {
        if (self instanceof Import_Data) {
            return true;
        }

        for (EObject child : self.eContents()) {
            if (hasImportData(child)) {
                return true;
            }
        }

        return false;
    }

    //End Audit check process has import data

    // Audit check Regular
       
    public boolean checkRegular(Preprocess self) {
            if (!self.getRegular().isEmpty()) {
                return true; 
            } 
        return false; 
    }
    // End Audit check Regular
    
    // Audit Simple Imputer when we have constant Strategy we should have fill value

    public boolean isConstantStrategy(Simple_Imputer self) {
        EList<Simple_Imputer_Arguments> arguments = self.getSimple_imputer_arguments();
        boolean isStrategyValueThree = false;
        boolean isFillValueExists = false;
        boolean isFillValueNotEmpty = false;

        for (Simple_Imputer_Arguments argument : arguments) {
            if (argument instanceof Strategy) {
                Strategy strategy = (Strategy) argument;
                if (strategy.getDefault_value_sim_str().getValue() == 3) {
                    isStrategyValueThree = true;
                }
            }
            if (argument instanceof Fill_Value) {
                isFillValueExists = true;
                Fill_Value fillValue = (Fill_Value) argument;
                if (fillValue.getDefault_value_sim_fill() != null && !fillValue.getDefault_value_sim_fill().isEmpty()) {
                    isFillValueNotEmpty = true;
                }
            }
        }

        // If Strategy value is 3, then Fill_Value must exist and its default value must not be empty
        if (isStrategyValueThree) {
            return isFillValueExists && isFillValueNotEmpty;
        } else {
            // If Strategy value is not 3, then Fill_Value should not exist
            return !isFillValueExists;
        }
    }
    


    // End Audit Simple Imputer when we have constant Strategy we should have fill value
    
    // Duplicates

    public String countDuplicateRows(EObject self) {
        ReadData aaa = new ReadData();
        String filepath = aaa.mm1(self);

        if (filepath == null || filepath.isEmpty()) {
            return "Error: Filepath is empty or null";
        }

        String csvFilePath = filepath;

        Cycle current = (Cycle) self;
        boolean foundCSVData = false;

        while (current != null) {
            if (current instanceof CSV) {
                foundCSVData = true;
                break;
            }
            if (current.getBefore() == null) {
                break; 
            }
            current = current.getBefore();
        }

        if (!foundCSVData) {
            return "Please Connect the Connection between operator Duplicate and Read Data.";
        }

        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            Set<String> seenRows = new HashSet<>();
            long duplicateRowCount = 0;

            String line;
            br.readLine(); // Skipping header line

            while ((line = br.readLine()) != null) {
                if (!seenRows.add(line)) {
                    duplicateRowCount++;
                }
            }
            
            return "Count of Duplicates: " + duplicateRowCount;
        } catch (IOException e) {
            e.printStackTrace();
            return "Error occurred while reading the file";
        }
    }
    

    public int countDuplicate(EObject self) {
        ReadData aaa = new ReadData();
        String filepath = aaa.mm1(self);

        if (filepath == null || filepath.isEmpty()) {
            return -1;
        }

        String csvFilePath = filepath;

        Cycle current = (Cycle) self;
        boolean foundCSVData = false;

        while (current != null) {
            if (current instanceof CSV) {
                foundCSVData = true;
                break;
            }
            if (current.getBefore() == null) {
                break; 
            }
            current = current.getBefore();
        }

        if (!foundCSVData) {
            return -1;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            Set<String> seenRows = new HashSet<>();
            int duplicateRowCount = 0;

            String line;
            br.readLine(); // Skipping header line

            while ((line = br.readLine()) != null) {
                if (!seenRows.add(line)) {
                    duplicateRowCount++;
                }
            }
            
            return duplicateRowCount;
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public int countTotalRows(EObject self) {
        ReadData aaa = new ReadData();
        String filepath = aaa.mm1(self);

        if (filepath == null || filepath.isEmpty()) {
            return -1;
        }

        String csvFilePath = filepath;

        Cycle current = (Cycle) self;
        boolean foundCSVData = false;

        while (current != null) {
            if (current instanceof CSV) {
                foundCSVData = true;
                break;
            }
            if (current.getBefore() == null) {
                break; 
            }
            current = current.getBefore();
        }

        if (!foundCSVData) {
            return -1;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            int totalRowCount = 0; 
            while (br.readLine() != null) {
                totalRowCount++;
            }
            
            return totalRowCount;
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public int countofnondup(EObject self) {
    	int a = countTotalRows(self) - countDuplicate(self);
		return a;
    	
    }


    
    public boolean DupCount(Duplicates self) {
        int countTotalDup = countDuplicate(self);
        if (countTotalDup != 0) {
			return true;
		}
        return false;
    }
    public String Duppm(Duplicates self) {
        return "Your Dataset Has not Duplicates Row:" + countDuplicate(self) + "/" + countTotalRows(self);
    }





    
    // End Duplicates
    
    //Visualization
    public boolean Visualization_Audit(Visualization self) {
        EList<Plots> argumentsList = self.getData_und_plots();
        
        for (Plots argument : argumentsList) {
            if (argument instanceof Plots) {
                return true; 
            }
        }
        
        return false;
    }

    
    // End Visualization
    //One hot audit
    
    public boolean OneHot_Audit(OneHot self) {
        List<String> result1 = getRegulars1(self);
        List<String> result2 = getCategoricalColumnNames(self);
        List<String> result3 = getRegularsAfter1(self);

        Set<String> set1And3 = new HashSet<>(result1);
        set1And3.addAll(result3);
        Set<String> set2 = new HashSet<>(result2);

        Cycle current = (Cycle) self;
        boolean foundCSVData = false;

        while (current != null) {
            if (current instanceof CSV) {
                foundCSVData = true;
                break;
            }
            if (current.getBefore() == null) {
                break; 
            }
            current = current.getBefore();
        }

        if (foundCSVData) {
            if (set1And3.equals(set2)) {
                return true;
            } else {
                Set<String> difference = new HashSet<>(set2);
                difference.removeAll(set1And3);
                if (!difference.isEmpty()) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return true;
    }

    //end one hot audit
    
    //Missing Values
    public boolean strategyofsimpleimputer(Simple_Imputer self) {
        EList<Simple_Imputer_Arguments> argumentsList = self.getSimple_imputer_arguments();
        
        for (Simple_Imputer_Arguments argument : argumentsList) {
            if (argument instanceof Strategy) {
                return true; 
            }
        }
        
        return false;
    }

    
    public String messeagestrategyofsimpleimputer(Simple_Imputer self) {
        boolean strofsimpleimputer = strategyofsimpleimputer(self);
        if (strofsimpleimputer == false) {
        	return "Please Add a Strategy for Simple Imputer Concespt";
			
		}
        
        return null;
        
    }

    public String messeagestrategyofknnimputer(KNN_Imputer self) {
        boolean strofknnimputer = strategyofknnimputer(self);
        if (strofknnimputer == false) {
        	return "Please Add a N Neighbors for KNN Imputer Concespt";
			
		}
        
        return null;
        
    }

    
    public boolean strategyofknnimputer(KNN_Imputer self) {
        EList<KNN_Argumans> argumentsList = self.getKnn_argumans();
        
        for (KNN_Argumans argument : argumentsList) {
            if (argument instanceof N_Neighbors) {
                return true; 
            }
        }
        
        return false;
    }
    
 
    public String messeagestrategyofPCA(PCA self) {
        boolean strofknnimputer = strategyofPCA(self);
        if (strofknnimputer == false) {
        	return "Please Add a Component or Variance Concespt";
			
		}
        
        return null;
        
    }

    
    public boolean strategyofPCA(PCA self) {
        EList<PCA_Argumans> argumentsList = self.getPca_argumans();
        
        for (PCA_Argumans argument : argumentsList) {
            if (argument instanceof mLmodel.Component || argument instanceof Varience) {
                return true; 
            }
        }
        
        return false;
    }
    
 
    public String messeagestrategyofdate(Date_to_Int self) {
        boolean strofknnimputer = strategyofdate(self);
        if (strofknnimputer == false) {
        	return "Please Add Year/Month/Day";
			
		}
        
        return null;
        
    }

    
    public boolean strategyofdate(Date_to_Int self) {
        EList<Date_Comp> argumentsList = self.getDate_comp();
        
        for (Date_Comp argument : argumentsList) {
            if (argument instanceof Year || argument instanceof Month || argument instanceof Day) {
                return true; 
            }
        }
        
        return false;
    }

    public boolean hasmiss(EObject self) {
        List<String> result1 = getRegulars(self);
        List<String> result2 = missindataset(self);
        List<String> result3 = getRegularsAfter(self);

        Set<String> set1And3 = new HashSet<>(result1);
        set1And3.addAll(result3);
        Set<String> set2 = new HashSet<>(result2);

        Cycle current = (Cycle) self;
        boolean foundCSVData = false;

        while (current != null) {
            if (current instanceof CSV) {
                foundCSVData = true;
                break;
            }
            if (current.getBefore() == null) {
                break; 
            }
            current = current.getBefore();
        }

        if (foundCSVData) {
            if (set1And3.equals(set2)) {
                return true;
            } else {
                Set<String> difference = new HashSet<>(set2);
                difference.removeAll(set1And3);
                if (!difference.isEmpty()) {
                    return false;
                } else {
                    return false;
                }
            }
        }
        return false;
    }


    


    public String comparemissvalue(EObject self) {
        List<String> result1 = getRegulars(self);
        List<String> result2 = missindataset(self);
        List<String> result3 = getRegularsAfter(self);

        Set<String> set1And3 = new HashSet<>(result1);
        set1And3.addAll(result3);
        Set<String> set2 = new HashSet<>(result2);

        Cycle current = (Cycle) self;
        boolean foundCSVData = false;

        while (current != null) {
            if (current instanceof CSV) {
                foundCSVData = true;
                break;
            }
            if (current.getBefore() == null) {
                break; 
            }
            current = current.getBefore();
        }

        if (foundCSVData) {
            if (set1And3.equals(set2)) {
                return "All attributes with missing values are covered";
            } else {
                Set<String> difference = new HashSet<>(set2);
                difference.removeAll(set1And3);
                if (!difference.isEmpty()) {
                    return "Warning: " + String.join(", ", difference);
                } else {
                    return "Not equal";
                }
            }
        }
        return "Data is not Import or Relation is not Defined";
    }



    public Set<String> auditmiss(EObject self) {
        List<String> result1 = getRegulars(self);
        List<String> result2 = missindataset(self);
        List<String> result3 = getRegularsAfter(self);

        Set<String> set1And3 = new HashSet<>(result1);
        set1And3.addAll(result3);
        Set<String> set2 = new HashSet<>(result2);

        Cycle current = (Cycle) self;
        boolean foundCSVData = false;

        while (current != null) {
            if (current instanceof CSV) {
                foundCSVData = true;
                break;
            }
            if (current.getBefore() == null) {
                break; 
            }
            current = current.getBefore();
        }

        if (foundCSVData) {
            if (!set1And3.equals(set2)) {
  
                Set<String> difference = new HashSet<>(set2);
                difference.removeAll(set1And3);
                if (!difference.isEmpty()) {
                    return difference;
                } 
            }
        }
        return null;
    }

    
    
    public List<String> missindataset(EObject self) {
    	ReadData aaa = new ReadData();
        String filepath = aaa.mm1(self);
        if (filepath == null || filepath.isEmpty()) {
            return List.of("Error: Root File Path is not available.");
        }

        String csvFilePath = filepath;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            String line;
            if ((line = br.readLine()) != null) {
                String[] variableTitles = line.split(",");
                int numColumns = variableTitles.length;
                int[] missingValuesCount = new int[numColumns];

                // Initialize the count for each column
                for (int i = 0; i < numColumns; i++) {
                    missingValuesCount[i] = 0;
                }

                // Read the rest of the lines in the CSV file
                while ((line = br.readLine()) != null) {
                    String[] values = line.split(",");

                    // Check each value in the line
                    for (int i = 0; i < numColumns; i++) {
                        if (i < values.length && values[i].isEmpty()) {
                            // Increment the count for missing values in the column
                            missingValuesCount[i]++;
                        }
                    }
                }

                // Build a list with the names of columns containing missing values
                List<String> columnsWithMissingValues = new ArrayList<>();
                for (int i = 0; i < numColumns; i++) {
                    if (missingValuesCount[i] > 0) {
                        columnsWithMissingValues.add(variableTitles[i]);
                    }
                }

                // Check if there are any columns with missing values
                if (!columnsWithMissingValues.isEmpty()) {
                    return columnsWithMissingValues;
                } else {
                    // No columns with missing values found
                    return List.of("Your dataset has no columns with missing values.");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return List.of("Error: Unable to identify columns with missing values. " + e.getMessage());
        }

        // Return an error message if any issues occur
        return List.of("Error: Unable to identify columns with missing values.");
    }
    
    public EList<String> getRegulars(EObject self) {
        if (self instanceof Preprocess) {
            EList<String> names = new BasicEList<>();

            // Add regulars from current Preprocess
            if (((Preprocess) self).getRegular() != null) {
                EList<Regular> currentRegulars = ((Preprocess) self).getRegular();
                for (Regular regular : currentRegulars) {
                    names.add(regular.getName());
                }
            }

            Cycle currentCycle = ((Preprocess) self).getBefore();
            while (currentCycle != null && !(currentCycle instanceof CSV)) {
                if (currentCycle instanceof Simple_Imputer || currentCycle instanceof KNN_Imputer) {
                    if (((Preprocess) currentCycle).getRegular() != null) {
                        EList<Regular> cycleRegulars = ((Preprocess) currentCycle).getRegular();
                        for (Regular regular : cycleRegulars) {
                            names.add(regular.getName());
                        }
                    }
                }
                currentCycle = currentCycle.getBefore();
            }

            return names;
        }
        return null;
    }

    public EList<String> getRegularsAfter(EObject self) {
        if (self instanceof Cycle) {
            EList<String> names = new BasicEList<>();

            // Add regulars from current Cycle
            if (((Preprocess) self).getRegular() != null) {
                EList<Regular> currentRegulars = ((Preprocess) self).getRegular();
                for (Regular regular : currentRegulars) {
                    names.add(regular.getName());
                }
            }

            Cycle currentCycle = ((Preprocess) self).getAfter();
            while (currentCycle != null && !(currentCycle instanceof CSV)) {
                if (currentCycle instanceof Simple_Imputer || currentCycle instanceof KNN_Imputer) {
                    if (((Preprocess) currentCycle).getRegular() != null) {
                        EList<Regular> cycleRegulars = ((Preprocess) currentCycle).getRegular();
                        for (Regular regular : cycleRegulars) {
                            names.add(regular.getName());
                        }
                    }
                }
                currentCycle = currentCycle.getAfter();
            }

            return names;
        }
        return null;
    }

    // End Missing Values
    
    // KNN

    public String compareLists(List<String> list1, List<String> list2) {
        if (list1.size() != list2.size()) {
            return "Some of Attributes has Missing data and they are not Handle by any Concepts of our Model."; 
        }
        
        for (String element1 : list1) {
            boolean found = false;
            for (String element2 : list2) {
                if (element1.equals(element2)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return "Some of Attributes has Missing data and they are not Handle by any Concepts of our Model."; 
            }
        }
        
        return "All Missing Data are handle"; 
    }
    
    public String compareResult1AndRegularNames(KNN self) {
        List<String> result1 = missindataset(self);
        List<String> regularNames = knnt(self);
        
        return compareLists(result1, regularNames);
    }

    public boolean compareListsknn(KNN self) {
        List<String> result1 = missindataset(self);
        List<String> regularNames = knnt(self);
        
        if (result1.isEmpty() || result1.size() == 1 && result1.get(0).equals("Your dataset has no columns with missing values.")) {
            return true;
        }

        
        if (result1.size() != regularNames.size()) {
            return false;
        }

        List<String> sortedList1 = new ArrayList<>(result1);
        List<String> sortedList2 = new ArrayList<>(regularNames);

        Collections.sort(sortedList1);
        Collections.sort(sortedList2);

        for (int i = 0; i < sortedList1.size(); i++) {
            if (!sortedList1.get(i).equals(sortedList2.get(i))) {
                return false;
            }
        }

        return true;
    }

    
    public List<String> knnt(KNN self) {
        List<String> regularNames = new ArrayList<>(); 
        Cycle currentAfter = self.getBefore();
        while (currentAfter != null) {
            if (currentAfter instanceof Simple_Imputer || currentAfter instanceof KNN_Imputer ) {
                EList<Regular> a = ((Preprocess) currentAfter).getRegular();
                for (Regular regular : a) {
                    regularNames.add(regular.getName());
                }
            }
            currentAfter = currentAfter.getBefore();
        }
        return regularNames;
    }
    
 
    
    public boolean checkvotingalg(Voting_Classifier self) {
        if (!self.getClassification().isEmpty()) {
            return true; 
        } 
    return false; 
}
    
    // End KNN
    

  //Check cluster evaluation
    
    public String clusterevaluation(EObject self) {
        if (self instanceof Cycle) {
        	Cycle before1 = ((Cluster_Evaluation) self).getBefore();
            if (before1 != null && (before1 instanceof Clustering)) {
                return null;
            }
        }
        return "A Clustering Algorithm Must be Connected Before the Concept of Cluster Evaluation";
    }
    
    public boolean beforeclusterevaluation(EObject self) {
        if (self instanceof Cycle) {
        	Cycle before1 = ((Cluster_Evaluation) self).getBefore();
            if (before1 != null && (before1 instanceof Clustering)) {
                return true;
            }
        }
        return false;
    }
    
    
    public boolean metrics1(Cluster_Evaluation self) {
        if (!(self.isCluster_centers() || self.isCluster_centers_features() || self.isCluster_centers_standard_deviation() || self.isCluster_sizes())) {
			return false;
			
		}
        return true;
    }

    public String metricspm1(Cluster_Evaluation self) {
        if (!(self.isCluster_centers() || self.isCluster_centers_features() || self.isCluster_centers_standard_deviation() || self.isCluster_sizes())) {
			return "You should chose a metric parameter";
			
		}
        return null;
    }
    
    //end

    
    
//Check Cross Validation
    
    public String Crossvalidation(EObject self) {
        if (self instanceof Cycle) {
        	Cycle before1 = ((Cross_Validation) self).getBefore();
            if (before1 != null && (before1 instanceof Classification)) {
                return null;
            }
        }
        return "A Classification Algorithm Must be Connected Before the Concept of Cross-Validation";
    }

    
    public boolean beforecrossmustbeclassification(EObject self) {
        if (self instanceof Cycle) {
        	Cycle before1 = ((Cross_Validation) self).getBefore();
            if (before1 != null && (before1 instanceof Classification)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean afterclassification(Classification self) {
        if (self instanceof Cycle) {
        	Classification after = (Classification) self.getAfter(); 
            if (after != null && after instanceof Classification) {
                return true;
            }
        }
        return false;
    }


    
  
    public boolean metrics(Cross_Validation self) {
        if (self.getNumber_of_folds() <= 1) {
            return false;
        }
        if (!(self.isPrecision() || self.isAccuracy() || self.isRecall() || self.isF1_score())) {
			return false;
			
		}
        return true;
    }

    public String metricspm(Cross_Validation self) {
        if (self.getNumber_of_folds() <= 1) {
            return "Number of folds can not be: "+ self.getNumber_of_folds() ;
        }
        if (!(self.isPrecision() || self.isAccuracy() || self.isRecall() || self.isF1_score())) {
			return "You should chose a metric parameter";
			
		}
        return null;
    }
    

 
    // detect type 




    public List<String> getDateColumns(EObject self) {
        ReadData aaa = new ReadData();

        String filepath = aaa.mm1(self);
        if (filepath == null || filepath.isEmpty()) {
            throw new IllegalArgumentException("Error: Root File Path is not available.");
        }

        String csvFilePath = filepath;
        List<String> dateColumns = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            String headerLine = br.readLine();
            String[] columnNames = headerLine.split(",");

            for (int i = 0; i < columnNames.length; i++) {
                boolean isDate = true;
                String line;
                try (BufferedReader br2 = new BufferedReader(new FileReader(csvFilePath))) {
                    br2.readLine(); 
                    while ((line = br2.readLine()) != null) {
                        String[] values = line.split(",");
                        String value = values[i].trim();
                        
                        // Check if the value is at most 10 characters and contains either "-" or "/"
                        if (value.length() > 10 || (!value.contains("-") && !value.contains("/"))) {
                            isDate = false;
                            break;
                        }
                    }
                }

                if (isDate) {
                    dateColumns.add(columnNames[i]);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("An error occurred: " + e.getMessage());
        }

        return dateColumns;
    }






    
    public EList<String> addtypes(EObject self) {
        EList<String> names = new BasicEList<>();

        // Get the list of binomial columns using getBinomialColumns method
        List<String> binomialColumns = getBinomialColumns(self);
        //List<String> numerical = getNumericColumns(self);
        List<String> Integer = getIntegerColumns(self);
        List<String> float_nu = getFloatColumns(self);
        List<String> StringColumns = getStringColumns(self);
        List<String> dateColumns = getDateColumns(self);
        List<String> datacategorical = getCategoricalColumnNames(self);

        EList<mLmodel.Set_Role> cc = ((Import_Data) self).getRole();

        // Loop through roles
        for (mLmodel.Set_Role role : cc) {
            if (role instanceof Regular) {
                Regular regular = (Regular) role;
                String columnName = regular.getName();
                if (float_nu.contains(columnName)) {
                    regular.setType(Attribiutes_Type.FLOAT);
                    names.add(columnName);
                }
                if (Integer.contains(columnName)) {
                    regular.setType(Attribiutes_Type.INTEGER);
                    names.add(columnName);
                }
                if (StringColumns.contains(columnName)) {
                    regular.setType(Attribiutes_Type.STRING);
                    names.add(columnName);
                }
                // Check if the column is of type "Boolean"
                if (binomialColumns.contains(columnName)) {
                    regular.setType(Attribiutes_Type.BINOMINAL);
                    names.add(columnName);
                }
                if (dateColumns.contains(columnName)) {
                    regular.setType(Attribiutes_Type.DATE);
                    names.add(columnName);
                }
                if (datacategorical.contains(columnName)) {
                    regular.setType(Attribiutes_Type.CATEGORICAL);
                    names.add(columnName);
                }
            }
        }

        return names;
    }
    
   
    
    public List<String> getBinomialColumns(EObject self) {
        ReadData aaa = new ReadData();

        String filepath = aaa.mm1(self);
        if (filepath == null || filepath.isEmpty()) {
            throw new IllegalArgumentException("Error: Root File Path is not available.");
        }

        String csvFilePath = filepath;
        List<String> binomialColumns = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            String headerLine = br.readLine();
            String[] columnNames = headerLine.split(",");

            for (int i = 0; i < columnNames.length; i++) {
                boolean isBinomial = true;
                String line;
                Set<String> valuesSet = new HashSet<>(); // Use set to ensure unique values
                try (BufferedReader br2 = new BufferedReader(new FileReader(csvFilePath))) {
                    br2.readLine(); 
                    while ((line = br2.readLine()) != null) {
                        String[] values = line.split(",");
                        try {
                            // Convert string value to number
                            Double.parseDouble(values[i].trim()); // You may use Integer.parseInt() for integer values
                            valuesSet.add(values[i].trim()); // Add values to set
                            if (valuesSet.size() > 2) { // If more than 2 unique values found, it's not binomial
                                isBinomial = false;
                                break;
                            }
                        } catch (NumberFormatException ex) {
                            // Handle cases where the value cannot be parsed to a number
                            // For example, log the error or skip the value
                        }
                    }
                }

                // Check if cardinality is exactly 2
                if (isBinomial && valuesSet.size() == 2) {
                    binomialColumns.add(columnNames[i]);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("An error occurred: " + e.getMessage());
        }

        return binomialColumns;
    }


    public List<String> getNumericColumns(EObject self) {
        ReadData aaa = new ReadData();

        String filepath = aaa.mm1(self);
        if (filepath == null || filepath.isEmpty()) {
            throw new IllegalArgumentException("Error: Root File Path is not available.");
        }

        String csvFilePath = filepath;
        List<String> numericColumns = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            String headerLine = br.readLine();
            String[] columnNames = headerLine.split(",");

            for (int i = 0; i < columnNames.length; i++) {
                boolean isNumeric = true;
                String line;
                try (BufferedReader br2 = new BufferedReader(new FileReader(csvFilePath))) {
                    br2.readLine(); 
                    while ((line = br2.readLine()) != null) {
                        String[] values = line.split(",");
                        try {
                            // Check if the value can be parsed as an integer
                            Integer.parseInt(values[i].trim());
                        } catch (NumberFormatException e1) {
                            try {
                                // If not, check if it can be parsed as a float
                                Float.parseFloat(values[i].trim());
                            } catch (NumberFormatException e2) {
                                try {
                                    // If not, check if it can be parsed as a double
                                    Double.parseDouble(values[i].trim());
                                } catch (NumberFormatException ignored) {
                                    isNumeric = false;
                                    break;
                                }
                            }
                        }
                    }
                }

                if (isNumeric) {
                    numericColumns.add(columnNames[i]);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("An error occurred: " + e.getMessage());
        }

        return numericColumns;
    }

    public List<String> getIntegerColumns(EObject self) {
        ReadData aaa = new ReadData();
        String filepath = aaa.mm1(self);
        if (filepath == null || filepath.isEmpty()) {
            throw new IllegalArgumentException("Error: Root File Path is not available.");
        }

        String csvFilePath = filepath;
        List<String> integerColumns = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            String headerLine = br.readLine();
            String[] columnNames = headerLine.split(",");

            for (int i = 0; i < columnNames.length; i++) {
                boolean isInteger = true;
                boolean hasDecimal = false; // New variable to check for decimal

                String line;
                try (BufferedReader br2 = new BufferedReader(new FileReader(csvFilePath))) {
                    br2.readLine();
                    while ((line = br2.readLine()) != null) {
                        String[] values = line.split(",");
                        if (values[i] == null || values[i].isEmpty()) {
                            continue; // Ignore null or empty values
                        }

                        if (values[i].contains(".")) { // Check for decimal
                            hasDecimal = true;
                            break;
                        }

                        try {
                            Integer.parseInt(values[i].trim());
                        } catch (NumberFormatException e1) {
                            isInteger = false;
                            break;
                        }
                    }
                }

                // Check if the column contains decimals, if so, it's not an integer column
                if (!hasDecimal && isInteger) {
                    integerColumns.add(columnNames[i]);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("An error occurred: " + e.getMessage());
        }

        return integerColumns;
    }


    public List<String> getFloatColumns(EObject self) {
        ReadData aaa = new ReadData();
        String filepath = aaa.mm1(self);
        if (filepath == null || filepath.isEmpty()) {
            throw new IllegalArgumentException("Error: Root File Path is not available.");
        }

        String csvFilePath = filepath;
        List<String> floatColumns = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            String headerLine = br.readLine();
            String[] columnNames = headerLine.split(",");

            for (int i = 0; i < columnNames.length; i++) {
                boolean isFloat = true;
                String line;
                try (BufferedReader br2 = new BufferedReader(new FileReader(csvFilePath))) {
                    br2.readLine();
                    while ((line = br2.readLine()) != null) {
                        String[] values = line.split(",");
                        if (values[i] == null || values[i].isEmpty()) {
                            continue; // Ignore null or empty values
                        }
                        try {
                            Float.parseFloat(values[i].trim());
                        } catch (NumberFormatException e1) {
                            isFloat = false;
                            break;
                        }
                    }
                }

                if (isFloat) {
                    floatColumns.add(columnNames[i]);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("An error occurred: " + e.getMessage());
        }

        return floatColumns;
    }


    public List<String> getStringColumns(EObject self) {
        ReadData aaa = new ReadData();

        String filepath = aaa.mm1(self);
        if (filepath == null || filepath.isEmpty()) {
            throw new IllegalArgumentException("Error: Root File Path is not available.");
        }

        String csvFilePath = filepath;
        List<String> stringColumns = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            String headerLine = br.readLine();
            String[] columnNames = headerLine.split(",");

            // Initialize all columns as potential string columns
            boolean[] isStringColumn = new boolean[columnNames.length];
            for (int i = 0; i < isStringColumn.length; i++) {
                isStringColumn[i] = true;
            }

            // Read the data and determine the type of each column
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                for (int i = 0; i < values.length; i++) {
                    try {
                        // Try to parse the value as a number
                        Double.parseDouble(values[i]);
                        // If parsing is successful, mark the column as not a string column
                        isStringColumn[i] = false;
                    } catch (NumberFormatException e) {
                        // Parsing failed, continue to the next value
                    }
                }
            }

            // Identify the columns recognized as string columns
            for (int i = 0; i < isStringColumn.length; i++) {
                if (isStringColumn[i]) {
                    stringColumns.add(columnNames[i]);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("An error occurred: " + e.getMessage());
        }

        return stringColumns;
    }

    public List<String> getCategoricalColumnNames(EObject self) {
    	int a = 2;
    	int b = 10;
        ReadData aaa = new ReadData();
        String filepath = aaa.mm1(self);
        if (filepath == null || filepath.isEmpty()) {
            throw new IllegalArgumentException("Error: Root File Path is not available.");
        }

        String csvFilePath = filepath;
        List<String> categoricalColumnNames = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            String headerLine = br.readLine();
            String[] columnNames = headerLine.split(",");

            int numberOfColumns = columnNames.length;

            // Create a map to store unique values for each column
            Map<String, Set<String>> columnValuesMap = new HashMap<>();
            for (String columnName : columnNames) {
                columnValuesMap.put(columnName, new HashSet<>());
            }

            // Read the file line by line
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                
                // Update unique values for each column
                for (int i = 0; i < numberOfColumns; i++) {
                    String columnName = columnNames[i];
                    String value = values[i].trim();
                    if (!value.isEmpty()) {
                        columnValuesMap.get(columnName).add(value);
                    }
                }
            }

            // Check cardinality of each column
            for (String columnName : columnValuesMap.keySet()) {
                Set<String> uniqueValues = columnValuesMap.get(columnName);
                if (uniqueValues.size() < b && uniqueValues.size() > a) {
                    categoricalColumnNames.add(columnName);
                }
            }

        } catch (IOException e) {
            throw new RuntimeException("An error occurred: " + e.getMessage());
        }

        return categoricalColumnNames;
    }

    
    // END detect type 

    





    
    public void set_auto_prep(EObject self) {
    	int dup = countDuplicate(self);
    	List<String> date = getDateColumns(self);
    	List<String> morethanmiss = morethanmiss(self);
    	boolean miss = hasmissindataset(self);
    	List<Regular> types = ((Preprocess) self).getRegular();
        EList<String> aa1 = new BasicEList<>();
        List<String> nummiss = nummiss(self);

        for (Regular regular : types) {
            aa1.add(regular.getType().name());

        }
        
    	if (dup > 0) {
            ((Auto_Prep) self).setDuplicates(true);
            
		}
    	else {
            ((Auto_Prep) self).setDuplicates(false);

    	}
    	
    	if (miss == true) {
            ((Auto_Prep) self).setSimple_Imputer(true);
		}
    	else {
            ((Auto_Prep) self).setSimple_Imputer(false);

    	}

    	if (!date.isEmpty()) {
    	    ((Auto_Prep) self).setDate_to_Int(true);
    	} else {
    	    ((Auto_Prep) self).setDate_to_Int(false);
    	}
    	
    	if(!morethanmiss.isEmpty()) {
    	    ((Auto_Prep) self).setDrop(true);
    	    
    	    

    	}else {
    	    ((Auto_Prep) self).setDrop(false);
    	}
    	
    	//edit for linear regresion
    	if(!nummiss.isEmpty()) {
    	    ((Auto_Prep) self).setDime_Reduct(true);
    	    
    	    

    	}else {
    	    ((Auto_Prep) self).setDime_Reduct(false);
    	}
    	


		}
    
    
    
    
    public boolean hasmissindataset(EObject self) {
    	ReadData aaa = new ReadData();
        String filepath = aaa.mm1(self);
        String csvFilePath = filepath;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            String line;
            if ((line = br.readLine()) != null) {
                String[] variableTitles = line.split(",");
                int numColumns = variableTitles.length;
                int[] missingValuesCount = new int[numColumns];

                // Initialize the count for each column
                for (int i = 0; i < numColumns; i++) {
                    missingValuesCount[i] = 0;
                }

                // Read the rest of the lines in the CSV file
                while ((line = br.readLine()) != null) {
                    String[] values = line.split(",");

                    // Check each value in the line
                    for (int i = 0; i < numColumns; i++) {
                        if (i < values.length && values[i].isEmpty()) {
                            // Increment the count for missing values in the column
                            missingValuesCount[i]++;
                        }
                    }
                }

                // Build a list with the names of columns containing missing values
                List<String> columnsWithMissingValues = new ArrayList<>();
                for (int i = 0; i < numColumns; i++) {
                    if (missingValuesCount[i] > 0) {
                        columnsWithMissingValues.add(variableTitles[i]);
                    }
                }

                // Check if there are any columns with missing values
                if (!columnsWithMissingValues.isEmpty()) {
                    return true;
                } else {
                    // No columns with missing values found
                    return false;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

        // Return an error message if any issues occur
        return false;
    }
    
    
    
    public List<String> morethanmiss(EObject self) {
        ReadData aaa = new ReadData();
        String filepath = aaa.mm1(self);
        if (filepath == null || filepath.isEmpty()) {
            return List.of("Error: Root File Path is not available.");
        }

        String csvFilePath = filepath;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            String line;
            if ((line = br.readLine()) != null) {
                String[] variableTitles = line.split(",");
                int numColumns = variableTitles.length;
                int[] missingValuesCount = new int[numColumns];
                int[] totalValuesCount = new int[numColumns];

                // Initialize the counts for each column
                for (int i = 0; i < numColumns; i++) {
                    missingValuesCount[i] = 0;
                    totalValuesCount[i] = 0;
                }

                // Read the rest of the lines in the CSV file
                while ((line = br.readLine()) != null) {
                    String[] values = line.split(",");

                    // Update counts for each column
                    for (int i = 0; i < numColumns; i++) {
                        totalValuesCount[i]++;
                        if (i < values.length && values[i].isEmpty()) {
                            // Increment the count for missing values in the column
                            missingValuesCount[i]++;
                        }
                    }
                }

                // Build a list with the names of columns containing more than 90% missing values
                List<String> columnsWithMoreThan90PercentMissingValues = new ArrayList<>();
                for (int i = 0; i < numColumns; i++) {
                    double percentageMissing = ((double) missingValuesCount[i]) / totalValuesCount[i];
                    if (percentageMissing > 0.9) {
                        columnsWithMoreThan90PercentMissingValues.add(variableTitles[i]);
                    }
                }

                // Check if there are any columns with more than 90% missing values
                if (!columnsWithMoreThan90PercentMissingValues.isEmpty()) {
                    return columnsWithMoreThan90PercentMissingValues;
                } else {
                    // No columns with more than 90% missing values found
                    return List.of("No columns have more than 90% missing values.");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return List.of("Error: Unable to identify columns with missing values. " + e.getMessage());
        }

        // Return an error message if any issues occur
        return List.of("Error: Unable to identify columns with missing values.");
    }


    public List<String> morethanmissqoute(Auto_Prep self) {
        ReadData aaa = new ReadData();
        String filepath = aaa.mm1(self);
        if (filepath == null || filepath.isEmpty()) {
            return List.of("Error: Root File Path is not available.");
        }

        String csvFilePath = filepath;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            String line;
            if ((line = br.readLine()) != null) {
                String[] variableTitles = line.split(",");
                int numColumns = variableTitles.length;
                int[] missingValuesCount = new int[numColumns];
                int[] totalValuesCount = new int[numColumns];

                // Initialize the counts for each column
                for (int i = 0; i < numColumns; i++) {
                    missingValuesCount[i] = 0;
                    totalValuesCount[i] = 0;
                }

                // Read the rest of the lines in the CSV file
                while ((line = br.readLine()) != null) {
                    String[] values = line.split(",");

                    // Update counts for each column
                    for (int i = 0; i < numColumns; i++) {
                        totalValuesCount[i]++;
                        if (i < values.length && values[i].isEmpty()) {
                            // Increment the count for missing values in the column
                            missingValuesCount[i]++;
                        }
                    }
                }

                // Build a list with the names of columns containing more than 90% missing values
                List<String> columnsWithMoreThan90PercentMissingValues = new ArrayList<>();
                for (int i = 0; i < numColumns; i++) {
                    double percentageMissing = ((double) missingValuesCount[i]) / totalValuesCount[i];
                    if (percentageMissing > 0.9) {
                        columnsWithMoreThan90PercentMissingValues.add("'" + variableTitles[i] + "'");
                    }
                }

                // Check if there are any columns with more than 90% missing values
                if (!columnsWithMoreThan90PercentMissingValues.isEmpty()) {
                    return columnsWithMoreThan90PercentMissingValues;
                } else {
                    // No columns with more than 90% missing values found
                    return List.of("No columns have more than 90% missing values.");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return List.of("Error: Unable to identify columns with missing values. " + e.getMessage());
        }

        // Return an error message if any issues occur
        return List.of("Error: Unable to identify columns with missing values.");
    }
    
    // Statistics
    
    public List<String> all_variables(EObject self) {
        ReadData aaa = new ReadData();
        String filepath = aaa.mm1(self);
        if (filepath == null || filepath.isEmpty()) {
            return List.of("Error: Root File Path is not available.");
        }

        String csvFilePath = filepath;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            String line;
            if ((line = br.readLine()) != null) {
                String[] variableTitles = line.split(",");
                // Return the titles of all columns
                return Arrays.asList(variableTitles);
            } else {
                return List.of("Error: The CSV file is empty.");
            }
        } catch (IOException e) {
            e.printStackTrace();
            return List.of("Error: Unable to read the CSV file. " + e.getMessage());
        }
    }
    
    

    public List<String> CountofMiss(EObject self) {
        ReadData aaa = new ReadData();
        String filepath = aaa.mm1(self);
        if (filepath == null || filepath.isEmpty()) {
            return List.of("Error: Root File Path is not available.");
        }

        String csvFilePath = filepath;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            String line;
            if ((line = br.readLine()) != null) {
                String[] variableTitles = line.split(",");
                int numColumns = variableTitles.length;
                int[] missingValuesCount = new int[numColumns];

                // Initialize the count for each column
                for (int i = 0; i < numColumns; i++) {
                    missingValuesCount[i] = 0;
                }

                // Read the rest of the lines in the CSV file
                while ((line = br.readLine()) != null) {
                    String[] values = line.split(",");

                    // Check each value in the line
                    for (int i = 0; i < numColumns; i++) {
                        if (i < values.length && values[i].isEmpty()) {
                            // Increment the count for missing values in the column
                            missingValuesCount[i]++;
                        }
                    }
                }

                // Build a list with the names of columns containing missing values
                List<String> columnsWithMissingValues = new ArrayList<>();
                for (int i = 0; i < numColumns; i++) {
                    if (missingValuesCount[i] > 0) {
                        // Append the count of missing values to the column name
                        String columnName = variableTitles[i] + ": " + missingValuesCount[i];
                        columnsWithMissingValues.add(columnName);
                    }
                }

                // Check if there are any columns with missing values
                if (!columnsWithMissingValues.isEmpty()) {
                    return columnsWithMissingValues;
                } else {
                    // No columns with missing values found
                    return List.of("Your dataset has no columns with missing values.");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return List.of("Error: Unable to identify columns with missing values. " + e.getMessage());
        }

        // Return an error message if any issues occur
        return List.of("Error: Unable to identify columns with missing values.");
    }

    

    public List<String> alldata1(EObject self) {
        ReadData aaa = new ReadData();
        String filepath = aaa.mm1(self);
        if (filepath == null || filepath.isEmpty()) {
            return List.of("Error: Root File Path is not available.");
        }

        String csvFilePath = filepath;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            String line;
            if ((line = br.readLine()) != null) {
                String[] variableTitles = line.split(",");
                int numColumns = variableTitles.length;
                double[] columnSums = new double[numColumns];
                int[] columnCounts = new int[numColumns];

                // Initialize sums and counts for each column
                Arrays.fill(columnSums, 0.0);
                Arrays.fill(columnCounts, 0);

                // Read the rest of the lines in the CSV file
                while ((line = br.readLine()) != null) {
                    String[] values = line.split(",");

                    // Check each value in the line
                    for (int i = 0; i < numColumns; i++) {
                        if (i < values.length && !values[i].isEmpty()) {
                            try {
                                double value = Double.parseDouble(values[i]);
                                // Add value to the sum for the column
                                columnSums[i] += value;
                                // Increment count for the column
                                columnCounts[i]++;
                            } catch (NumberFormatException e) {
                                // Handle non-numerical values
                                // If value is not numerical, treat it as "non numerical"
                                // Do not perform sum and count for this column
                            }
                        }
                    }
                }

                // Calculate averages for each column
                List<String> columnAverages = new ArrayList<>();
                DecimalFormat df = new DecimalFormat("#.##");
                for (int i = 0; i < numColumns; i++) {
                    if (columnCounts[i] > 0) {
                        double average = columnSums[i] / columnCounts[i];
                        String formattedAverage = df.format(average);
                        columnAverages.add(variableTitles[i] + ": " + formattedAverage);
                    } else {
                        // Handle case where all values in column are non numerical
                        columnAverages.add(variableTitles[i] + ": non numerical");
                    }
                }

                return columnAverages;
            } else {
                return List.of("Error: The CSV file is empty.");
            }
        } catch (IOException e) {
            e.printStackTrace();
            return List.of("Error: Unable to read the CSV file. " + e.getMessage());
        }
    }

    public String alldata12(EObject self) {
        ReadData aaa = new ReadData();
        String filepath = aaa.mm1(self);
        if (filepath == null || filepath.isEmpty()) {
            return "Error: Root File Path is not available.";
        }

        String csvFilePath = filepath;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            String line;
            if ((line = br.readLine()) != null) {
                String[] variableTitles = line.split(",");
                int numColumns = variableTitles.length;
                double[] columnSums = new double[numColumns];
                int[] columnCounts = new int[numColumns];
                double[] columnMin = new double[numColumns];
                double[] columnMax = new double[numColumns];
                Arrays.fill(columnSums, 0.0);
                Arrays.fill(columnCounts, 0);
                Arrays.fill(columnMin, Double.MAX_VALUE);
                Arrays.fill(columnMax, Double.MIN_VALUE);

                StringBuilder result = new StringBuilder();
                DecimalFormat df = new DecimalFormat("#.##");

                // Append the title row
                result.append("| Attributes name | Mean | Min | Max |\n");
                result.append("|-----------------|------|-----|-----|\n");

                while ((line = br.readLine()) != null) {
                    String[] values = line.split(",");

                    for (int i = 0; i < numColumns; i++) {
                        if (i < values.length && !values[i].isEmpty()) {
                            try {
                                double value = Double.parseDouble(values[i]);
                                columnSums[i] += value;
                                columnCounts[i]++;
                                columnMin[i] = Math.min(columnMin[i], value);
                                columnMax[i] = Math.max(columnMax[i], value);
                            } catch (NumberFormatException e) {
                                // Handle non-numerical values
                            }
                        }
                    }
                }

                for (int i = 0; i < numColumns; i++) {
                    result.append("| ").append(variableTitles[i]).append(" : ");
                    if (columnCounts[i] > 0) {
                        double average = columnSums[i] / columnCounts[i];
                        result.append(df.format(average)).append(" | ");
                        result.append(df.format(columnMin[i])).append(" | ");
                        result.append(df.format(columnMax[i])).append(" |\n");
                    } else {
                        result.append("non numerical | non numerical | non numerical |\n");
                    }
                }

                return result.toString();
            } else {
                return "Error: The CSV file is empty.";
            }
        } catch (IOException e) {
            e.printStackTrace();
            return "Error: Unable to read the CSV file. " + e.getMessage();
        }
    }


    // shape of the things
    
public boolean process_errors(Process self) {
	
	boolean isimort_dataset = hasImportData(self);
	boolean filepath_dataset = filepathnameprocess(self);

	if (isimort_dataset && filepath_dataset) {
		return true;
	}
	
	return false;
	
}

public boolean Simple_Imputer_er(Simple_Imputer self) {
	
	boolean str = strategyofsimpleimputer(self);
	boolean hasmiss = hasmiss(self);
	boolean checkRegular = checkRegular(self);


	if (str && hasmiss && checkRegular) {
		return true;
	}
	
	return false;
	
}

public boolean voting_er(Voting_Classifier self) {
	
	boolean chk = checkvotingalg(self);
	boolean afternull = afterclassification(self);



	if (chk && afternull) {
		return true;
	}
	
	return false;
	
}



// correlation
public String calculateCorrelation(EObject self) {
    ReadData aaa = new ReadData();
    String filepath = aaa.mm1(self);
    if (filepath == null || filepath.isEmpty()) {
        return "Error: Root File Path is not available.";
    }

    String csvFilePath = filepath;

    try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
        String line;
        if ((line = br.readLine()) != null) {
            String[] variableTitles = line.split(",");
            int numColumns = variableTitles.length;
            List<List<Double>> data = new ArrayList<>();

            // Initialize data list
            for (int i = 0; i < numColumns; i++) {
                data.add(new ArrayList<>());
            }

            // Read data from CSV
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                for (int i = 0; i < numColumns; i++) {
                    if (i < values.length && !values[i].isEmpty()) {
                        try {
                            double value = Double.parseDouble(values[i]);
                            data.get(i).add(value);
                        } catch (NumberFormatException e) {
                            // Handle non-numerical values
                        }
                    }
                }
            }

            // Calculate correlation coefficient for all pairs of columns
            StringBuilder result = new StringBuilder();

            // Append the title row
            result.append("| Attribute 1 | Attribute 2 | Correlation Coefficient |\n");
            result.append("|--------------|--------------|-------------------------|\n");

            DecimalFormat df = new DecimalFormat("#.##");
            for (int i = 0; i < numColumns; i++) {
                for (int j = i + 1; j < numColumns; j++) {
                    double correlation = calculatePearsonCorrelation(data.get(i), data.get(j));
                    result.append("| ").append(variableTitles[i]).append(" | ").append(variableTitles[j]).append(" : ");
                    result.append(df.format(correlation)).append(" |\n");
                }
            }

            return result.toString();
        } else {
            return "Error: The CSV file is empty.";
        }
    } catch (IOException e) {
        e.printStackTrace();
        return "Error: Unable to read the CSV file. " + e.getMessage();
    }
}

private double calculatePearsonCorrelation(List<Double> x, List<Double> y) {
    int n = Math.min(x.size(), y.size());
    double sumX = 0.0, sumY = 0.0, sumXY = 0.0, sumXSquare = 0.0, sumYSquare = 0.0;
    int validCount = 0; // Count of valid numeric values

    for (int i = 0; i < n; i++) {
        double xi = x.get(i);
        double yi = y.get(i);
        if (!Double.isNaN(xi) && !Double.isNaN(yi)) { // Check if the values are numeric
            sumX += xi;
            sumY += yi;
            sumXY += xi * yi;
            sumXSquare += xi * xi;
            sumYSquare += yi * yi;
            validCount++;
        }
    }

    if (validCount == 0) {
        return Double.NaN; // Return NaN if no valid numeric values found
    }

    double numerator = validCount * sumXY - sumX * sumY;
    double denominator = Math.sqrt((validCount * sumXSquare - sumX * sumX) * (validCount * sumYSquare - sumY * sumY));

    if (denominator == 0) {
        return 0; // Avoid division by zero
    }

    return numerator / denominator;
}


//Statistics Popup

public boolean statistics_values(EObject self) {
	if  (self instanceof Statistics) {
		return true;
		
	}
	return false; 
		
	}

public boolean Correlation_values(EObject self) {
	if  (self instanceof Correlation) {
		return true;
		
	}
	return false; 
		
	}

public boolean CSVdata(EObject self) {
	if  (self instanceof Import_Data) {
		return true;
		
	}
	return false; 
		
	}

// manage categorical and string variables before KNN
public EList<Set_Role> compare(KNN self) {
    Cycle current = self.getBefore();
    return findImportData(current);
}

private EList<Set_Role> findImportData(Cycle current) {
    if (current instanceof Import_Data) {
        EList<Set_Role> roles = new BasicEList<>();
        for (Set_Role role : ((Import_Data) current).getRole()) {
            if (role instanceof Regular) {
                roles.add(role);
            }
        }
        return roles;
    } else if (current != null) {
        return findImportData(current.getBefore());
    } else {
        return null;
    }
}
 


// remove variables in data set
public List<String> all_variable_names(CSV self) {
    EList<Regular> Regulars = self.getRegular();
    List<String> Regularsnames = new ArrayList<>();
    for (Regular regular : Regulars) {
        Regularsnames.add(regular.getName());
    }

    ReadData aaa = new ReadData();
    String filepath = aaa.mm1(self);
    EList<String> columnNames = new BasicEList<>();
    if (filepath == null || filepath.isEmpty()) {
        return columnNames;
    }

    String csvFilePath = filepath;

    try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
        List<String> lines = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            lines.add(line);
        }
        
        for (int i = 0; i < lines.size(); i++) {
            String[] parts = lines.get(i).split("[;,]");
            for (String regularName : Regularsnames) {
                for (int j = 0; j < parts.length; j++) {
                    if (parts[j].equals(regularName)) {
                        for (int k = 0; k < lines.size(); k++) {
                            String[] partsToRemove = lines.get(k).split("[;,]");
                            if (partsToRemove.length > j) {
                                List<String> partsList = new ArrayList<>(Arrays.asList(partsToRemove));
                                partsList.remove(j);
                                lines.set(k, String.join(",", partsList));
                            }
                        }
                    }
                }
            }
        }
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFilePath))) {
            for (String updatedLine : lines) {
                bw.write(updatedLine);
                bw.newLine();
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }

    return columnNames;
}
public List<String> missingDataAnalysis(EObject self) {
    ReadData reader = new ReadData();
    String filepath = reader.mm1(self);
    if (filepath == null || filepath.isEmpty()) {
        return List.of("Error: Root File Path is not available.");
    }

    String csvFilePath = filepath;

    try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
        String line;
        if ((line = br.readLine()) != null) {
            String[] variableTitles = line.split(",");
            int numColumns = variableTitles.length;
            int[] missingValuesCount = new int[numColumns];

            // Initialize the count for each column
            for (int i = 0; i < numColumns; i++) {
                missingValuesCount[i] = 0;
            }

            // Read the rest of the lines in the CSV file
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");

                // Check each value in the line
                for (int i = 0; i < numColumns; i++) {
                    if (i < values.length && values[i].isEmpty()) {
                        // Increment the count for missing values in the column
                        missingValuesCount[i]++;
                    }
                }
            }

            // Draw bar chart for columns with missing values
            drawBarChart(variableTitles, missingValuesCount);

            // No need to return anything here as we've displayed the chart
            return List.of();
        }
    } catch (IOException e) {
        e.printStackTrace();
        return List.of("Error: Unable to identify columns with missing values. " + e.getMessage());
    }

    // Return an error message if any issues occur
    return List.of("Error: Unable to identify columns with missing values.");
}

private void drawBarChart(String[] variableTitles, int[] missingValuesCount) {
    JFrame frame = new JFrame("Bar Chart");
    frame.setSize(800, 600);
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    JPanel panel = new JPanel() {
        /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;

            int maxCount = 0;
            for (int count : missingValuesCount) {
                maxCount = Math.max(maxCount, count);
            }

            int width = getWidth();
            int height = getHeight();
            int barWidth = width / (2 * variableTitles.length + 1);

            // Define a constant for chart height (e.g., 500)
            int chartHeight = 500;

            // Calculate a coefficient to increase the chart height
            double coefficient = (double) chartHeight / (double) maxCount;

            // Draw horizontal grid lines
            g2d.setColor(Color.LIGHT_GRAY);
            int numGridLines = 10;
            for (int i = 1; i <= numGridLines; i++) {
                int y = height - i * height / numGridLines - 50;
                g2d.drawLine(50, y, width - 50, y);
            }

            for (int i = 0; i < variableTitles.length; i++) {
                if (missingValuesCount[i] != 0) {
                    int x = (2 * i + 1) * barWidth;
                    // Apply the coefficient to adjust the bar height
                    int barHeight = (int) (missingValuesCount[i] * coefficient);
                    int y = height - barHeight - 50;
                    g2d.setColor(Color.BLUE);
                    g2d.fillRect(x, y, barWidth, barHeight);
                    g2d.setColor(Color.BLACK);
                    g2d.drawRect(x, y, barWidth, barHeight);

                    g2d.drawString(variableTitles[i], x + barWidth / 2 - 10, height - 20);
                    g2d.drawString(String.valueOf(missingValuesCount[i]), x + barWidth / 2 - 5, y - 5);
                }
            }

            // Draw x-axis label
            g2d.drawString("Variables", width / 2 - 20, height - 5);

            // Draw y-axis label
            g2d.drawString("Missing Values Count", 5, height / 2);

            // Draw y-axis line
            g2d.drawLine(50, 50, 50, height - 50);

            // Draw x-axis line
            g2d.drawLine(50, height - 50, width - 50, height - 50);
        }
    };

    frame.add(panel);
    frame.setVisible(true);
}

///scatter test

public List<String> analyzeMissingData(EObject self) {
    ReadData reader = new ReadData();
    String filepath = reader.mm1(self);
    if (filepath == null || filepath.isEmpty()) {
        return List.of("Error: Root File Path is not available.");
    }

    String csvFilePath = filepath;

    try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
        String line;
        if ((line = br.readLine()) != null) {
            String[] variableTitles = line.split(",");
            int numColumns = variableTitles.length;
            int[] missingValuesCount = new int[numColumns];

            // Initialize the count for each column
            for (int i = 0; i < numColumns; i++) {
                missingValuesCount[i] = 0;
            }

            // Read the rest of the lines in the CSV file
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");

                // Check each value in the line
                for (int i = 0; i < numColumns; i++) {
                    if (i < values.length && values[i].isEmpty()) {
                        // Increment the count for missing values in the column
                        missingValuesCount[i]++;
                    }
                }
            }

            // Draw scatter plot for columns with missing values
            drawScatterPlot(variableTitles, missingValuesCount);

            // No need to return anything here as we've displayed the chart
            return List.of();
        }
    } catch (IOException e) {
        e.printStackTrace();
        return List.of("Error: Unable to identify columns with missing values. " + e.getMessage());
    }

    // Return an error message if any issues occur
    return List.of("Error: Unable to identify columns with missing values.");
}

private void drawScatterPlot(String[] variableTitles, int[] missingValuesCount) {
    JFrame frame = new JFrame("Scatter Plot");
    frame.setSize(800, 600);
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    JPanel panel = new JPanel() {
        /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;

            int maxCount = 0;
            for (int count : missingValuesCount) {
                maxCount = Math.max(maxCount, count);
            }

            int width = getWidth();
            int height = getHeight();

            // Define margins and plot area dimensions
            int margin = 50;
            int plotWidth = width - 2 * margin;
            int plotHeight = height - 2 * margin;

            // Draw horizontal grid lines
            g2d.setColor(Color.LIGHT_GRAY);
            int numGridLines = 10;
            for (int i = 1; i <= numGridLines; i++) {
                int y = height - i * plotHeight / numGridLines - margin;
                g2d.drawLine(margin, y, width - margin, y);
            }

            // Scatter plot points
            for (int i = 0; i < variableTitles.length; i++) {
                if (missingValuesCount[i] != 0) {
                    // Calculate the position for each point
                    int x = margin + i * plotWidth / variableTitles.length + plotWidth / (2 * variableTitles.length);
                    int y = height - margin - (int)((double)missingValuesCount[i] / maxCount * plotHeight);

                    // Draw point
                    g2d.setColor(Color.RED);
                    g2d.fillOval(x - 3, y - 3, 6, 6);

                    // Draw variable title
                    g2d.drawString(variableTitles[i], x - 10, height - 20);

                    // Draw missing value count near the point
                    g2d.drawString(String.valueOf(missingValuesCount[i]), x + 5, y - 5);
                }
            }

            // Draw x-axis label
            g2d.setColor(Color.BLACK);
            g2d.drawString("Variables", width / 2 - 20, height - 5);

            // Draw y-axis label
            g2d.drawString("Missing Values Count", 5, height / 2);

            // Draw y-axis line
            g2d.drawLine(margin, margin, margin, height - margin);

            // Draw x-axis line
            g2d.drawLine(margin, height - margin, width - margin, height - margin);
        }
    };

    frame.add(panel);
    frame.setVisible(true);
}

///

//statistics visualization
public List<String> analyzeData(EObject self) {
    ReadData reader = new ReadData();
    String filepath = reader.mm1(self);
    if (filepath == null || filepath.isEmpty()) {
        return List.of("Error: Root File Path is not available.");
    }

    String csvFilePath = filepath;

    BufferedReader br = null;
    try {
        br = new BufferedReader(new FileReader(csvFilePath));
        String line;
        if ((line = br.readLine()) != null) {
            String[] variableTitles = line.split(",");
            int numColumns = variableTitles.length;
            double[] means = new double[numColumns];
            double[] medians = new double[numColumns];
            double[] stdDevs = new double[numColumns];

            // Initialize arrays to hold column data
            List<List<Double>> columnData = new ArrayList<>();
            for (int i = 0; i < numColumns; i++) {
                columnData.add(new ArrayList<>());
            }

            // Read the rest of the lines in the CSV file
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");

                // Parse values and add to column data
                for (int i = 0; i < numColumns; i++) {
                    if (i < values.length && isNumeric(values[i])) {
                        columnData.get(i).add(Double.parseDouble(values[i]));
                    }
                }
            }

            // Calculate means, medians, and standard deviations for each numerical column
            for (int i = 0; i < numColumns; i++) {
                if (!columnData.get(i).isEmpty()) {
                    means[i] = calculateMean(columnData.get(i));
                    medians[i] = calculateMedian(columnData.get(i));
                    stdDevs[i] = calculateStandardDeviation(columnData.get(i));
                }
            }

            // Draw bar chart for each numerical variable with its mean, median, and standard deviation
            drawBarChart(variableTitles, means, medians, stdDevs);

            // No need to return anything here as we've displayed the chart
            return List.of();
        }
    } catch (IOException e) {
        e.printStackTrace();
        return List.of("Error: Unable to analyze data. " + e.getMessage());
    } finally {
        if (br != null) {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // Return an error message if any issues occur
    return List.of("Error: Unable to analyze data.");
}

private double calculateMean(List<Double> data) {
    double sum = 0;
    for (double value : data) {
        sum += value;
    }
    return sum / data.size();
}

private double calculateMedian(List<Double> data) {
    data.sort(null);
    int size = data.size();
    if (size % 2 == 0) {
        return (data.get(size / 2 - 1) + data.get(size / 2)) / 2.0;
    } else {
        return data.get(size / 2);
    }
}

private double calculateStandardDeviation(List<Double> data) {
    double mean = calculateMean(data);
    double sum = 0;
    for (double value : data) {
        sum += Math.pow(value - mean, 2);
    }
    return Math.sqrt(sum / data.size());
}
private void drawBarChart(String[] variableTitles, double[] means, double[] medians, double[] stdDevs) {
    JFrame frame = new JFrame("Data Analysis");
    frame.setSize(800, 600);
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    JPanel panel = new JPanel() {
        /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;

            int numVariables = variableTitles.length;
            int barWidth = 40;
            int padding = 20;
            int startX = 50;

            // Find the maximum value among means, medians, and stdDevs
            double maxVal = Arrays.stream(means).max().getAsDouble();
            maxVal = Math.max(maxVal, Arrays.stream(medians).max().getAsDouble());
            maxVal = Math.max(maxVal, Arrays.stream(stdDevs).max().getAsDouble());

            // Calculate the scale factor for the chart
            double scaleFactor = maxVal > 100 ? 100 / maxVal : 1;

            // Calculate the height of the chart area
            int chartHeight = (int) (getHeight() * 0.8);
            int yOffset = (int) (getHeight() * 0.1);

            for (int i = 0; i < numVariables; i++) {
                // Calculate absolute X position for each variable
                int x = startX + i * (barWidth * 3 + padding);

                // Draw mean if it's not NaN (not a number)
                if (!Double.isNaN(means[i])) {
                    int yMean = yOffset + (int) (chartHeight * (1 - means[i] * scaleFactor / 100)); // Scale means to fit

                    // Draw mean
                    g2d.setColor(Color.BLUE);
                    g2d.fillRect(x, yMean, barWidth, getHeight() - yMean);
                    g2d.setColor(Color.BLACK);
                    g2d.drawString("Mean: " + String.format("%.2f", means[i]), x, yMean - 5);
                }

                // Draw median if it's not NaN
                if (!Double.isNaN(medians[i])) {
                    int yMedian = yOffset + (int) (chartHeight * (1 - medians[i] * scaleFactor / 100)); // Scale medians to fit

                    // Draw median
                    g2d.setColor(Color.RED);
                    g2d.fillRect(x + barWidth + padding, yMedian, barWidth, getHeight() - yMedian);
                    g2d.setColor(Color.BLACK);
                    g2d.drawString("Median: " + String.format("%.2f", medians[i]), x + barWidth + padding, yMedian - 5);
                }

                // Draw std dev if it's not NaN
                if (!Double.isNaN(stdDevs[i])) {
                    int yStdDev = yOffset + (int) (chartHeight * (1 - stdDevs[i] * scaleFactor / 100)); // Scale std devs to fit

                    // Draw std dev
                    g2d.setColor(Color.GREEN);
                    g2d.fillRect(x + 2 * (barWidth + padding), yStdDev, barWidth, getHeight() - yStdDev);
                    g2d.setColor(Color.BLACK);
                    g2d.drawString("Std Dev: " + String.format("%.2f", stdDevs[i]), x + 2 * (barWidth + padding), yStdDev - 5);
                }

                // Draw variable title
                g2d.setColor(Color.BLACK);
                g2d.drawString(variableTitles[i], x + barWidth / 2 - g2d.getFontMetrics().stringWidth(variableTitles[i]) / 2, getHeight() - 5);
            }
        }
    };

    frame.add(panel);
    frame.setVisible(true);
}

private boolean isNumeric(String str) {
    return str.matches("-?\\d+(\\.\\d+)?");
}

//end
public List<String> correlationAnalysis(EObject self) {
    ReadData reader = new ReadData();
    String filepath = reader.mm1(self);
    if (filepath == null || filepath.isEmpty()) {
        return List.of("Error: Root File Path is not available.");
    }

    String csvFilePath = filepath;

    try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
        String line;
        if ((line = br.readLine()) != null) {
            String[] variableTitles = line.split(",");
            int numColumns = variableTitles.length;
            List<double[]> data = new ArrayList<>();

            // Read the rest of the lines in the CSV file
            while ((line = br.readLine()) != null) {
                if(line.trim().isEmpty())
                    continue; // Skip empty lines
                String[] values = line.split(",");
                double[] rowData = new double[numColumns];

                // Convert numerical values to double and fill the row data
                for (int i = 0; i < numColumns; i++) {
                    double value;
                    try {
                        value = Double.parseDouble(values[i]);
                    } catch (NumberFormatException e) {
                        // In case of non-numeric values, set to NaN
                        value = Double.NaN;
                    }
                    rowData[i] = value;
                }

                data.add(rowData);
            }

            // Calculate correlation matrix
            double[][] correlationMatrix = calculateCorrelationMatrix(data);

            // Draw correlation heat map
            drawHeatMap(variableTitles, correlationMatrix);

            // No need to return anything here as we've displayed the heat map
            return List.of();
        }
    } catch (IOException e) {
        e.printStackTrace();
        return List.of("Error: Unable to read the CSV file. " + e.getMessage());
    }

    // Return an error message if any issues occur
    return List.of("Error: Unable to calculate correlation heat map.");
}

private double[][] calculateCorrelationMatrix(List<double[]> data) {
    int numVariables = data.get(0).length;
    double[][] correlationMatrix = new double[numVariables][numVariables];

    for (int i = 0; i < numVariables; i++) {
        for (int j = 0; j < numVariables; j++) {
            double correlation = calculateCorrelation(data, i, j);
            correlationMatrix[i][j] = correlation;
        }
    }

    return correlationMatrix;
}

private double calculateCorrelation(List<double[]> data, int var1Index, int var2Index) {
    double sumX = 0;
    double sumY = 0;
    double sumXY = 0;
    double sumXSquare = 0;
    double sumYSquare = 0;
    int n = data.size();

    for (double[] row : data) {
        double x = row[var1Index];
        double y = row[var2Index];

        sumX += x;
        sumY += y;
        sumXY += x * y;
        sumXSquare += x * x;
        sumYSquare += y * y;
    }

    double correlation = (n * sumXY - sumX * sumY) /
            Math.sqrt((n * sumXSquare - sumX * sumX) * (n * sumYSquare - sumY * sumY));

    return correlation;
}

private void drawHeatMap(String[] variableTitles, double[][] correlationMatrix) {
    JFrame frame = new JFrame("Correlation Heat Map");
    frame.setSize(800, 600);
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    JPanel panel = new JPanel() {
        /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;

            int numVariables = variableTitles.length;
            int cellSize = 40;

            // Draw heatmap cells
            for (int i = 0; i < numVariables; i++) {
                for (int j = 0; j < numVariables; j++) {
                    int x = 50 + j * cellSize;
                    int y = 50 + i * cellSize;

                    // Map correlation value to color
                    Color color = getColorForCorrelation(correlationMatrix[i][j]);
                    g2d.setColor(color);
                    g2d.fillRect(x, y, cellSize, cellSize);

                    // Draw border for each cell
                    g2d.setColor(Color.BLACK);
                    g2d.drawRect(x, y, cellSize, cellSize);

                    // Display correlation value as text in each cell
                    String correlationText = String.format("%.2f", correlationMatrix[i][j]);
                    g2d.drawString(correlationText, x + 10, y + 20);
                }
            }

            // Draw variable titles
            g2d.setColor(Color.BLACK);
            for (int i = 0; i < numVariables; i++) {
                int x = 50 + i * cellSize + cellSize / 2 - 10;
                g2d.drawString(variableTitles[i], x, 40);
                g2d.drawString(variableTitles[i], 20, 50 + i * cellSize + cellSize / 2 + 5);
            }
        }
    };

    frame.add(panel);
    frame.setVisible(true);
}


private Color getColorForCorrelation(double correlation) {
    // Choose color based on correlation value
    // You can customize this method to fit your color scheme
    if (Double.isNaN(correlation)) {
        return Color.WHITE; // Non-numeric values are shown as white
    } else if (correlation < -0.7) {
        return Color.BLUE;
    } else if (correlation > 0.7) {
        return Color.RED;
    } else {
        return Color.WHITE; // Near zero correlation values are also shown as white
    }
}
//end

public List<List<Object>> datashow(EObject self) {
    ReadData aaa = new ReadData();
    String filepath = aaa.mm1(self);
    List<List<Object>> table = new ArrayList<>();

    if (filepath == null || filepath.isEmpty()) {
        return table;
    }

    String csvFilePath = filepath;

    try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
        String line;
        String[] columnTitles = null;

        // Read column titles and add as the first row
        if ((line = br.readLine()) != null) {
            columnTitles = line.split("[;,]");
            List<Object> titleRow = new ArrayList<>();
            for (String title : columnTitles) {
                titleRow.add(title.trim()); // Trim titles to remove leading/trailing spaces
            }
            table.add(titleRow);
        }

        // Read the data rows and add them to the table
        while ((line = br.readLine()) != null) {
            String[] rowData = line.split("[;,]");
            List<Object> row = new ArrayList<>();
            for (int i = 0; i < rowData.length; i++) {
                String data = rowData[i].trim(); // Trim data to remove leading/trailing spaces
                if (i < columnTitles.length - 1) {
                    try {
                        // Try to parse as double if possible (excluding last column)
                        double value = Double.parseDouble(data);
                        row.add(value);
                    } catch (NumberFormatException e) {
                        // If parsing as double fails, add as String
                        row.add(data);
                    }
                } else {
                    // Last column is assumed to be String (variety)
                    row.add(data);
                }
            }
            table.add(row);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }

    return table;
}




//one hot audit start

//compare one hot categorical data
public String auditonehot(EObject self) {
    List<String> result1 = getRegulars1(self);
    List<String> result2 = getCategoricalColumnNames(self);
    List<String> result3 = getRegularsAfter1(self);

    Set<String> set1And3 = new HashSet<>(result1);
    set1And3.addAll(result3);
    Set<String> set2 = new HashSet<>(result2);

    Cycle current = (Cycle) self;
    boolean foundCSVData = false;

    while (current != null) {
        if (current instanceof CSV) {
            foundCSVData = true;
            break;
        }
        if (current.getBefore() == null) {
            break; 
        }
        current = current.getBefore();
    }

    if (foundCSVData) {
        if (set1And3.equals(set2)) {
            return "All Categorical Data Types are covered";
        } else {
            Set<String> difference = new HashSet<>(set2);
            difference.removeAll(set1And3);
            if (!difference.isEmpty()) {
                return "Handle Categorical Data: " + String.join(", ", difference);
            } else {
                return "Not equal";
            }
        }
    }
    return "Data is not Import or Relation is not Defined";
}

public EList<String> getRegulars1(EObject self) {
    if (self instanceof Preprocess) {
        EList<String> names = new BasicEList<>();

        // Add regulars from current Preprocess
        if (((Preprocess) self).getRegular() != null) {
            EList<Regular> currentRegulars = ((Preprocess) self).getRegular();
            for (Regular regular : currentRegulars) {
                names.add(regular.getName());
            }
        }

        Cycle currentCycle = ((Preprocess) self).getBefore();
        while (currentCycle != null && !(currentCycle instanceof CSV)) {
            if (currentCycle instanceof OneHot) {
                if (((Preprocess) currentCycle).getRegular() != null) {
                    EList<Regular> cycleRegulars = ((Preprocess) currentCycle).getRegular();
                    for (Regular regular : cycleRegulars) {
                        names.add(regular.getName());
                    }
                }
            }
            currentCycle = currentCycle.getBefore();
        }

        return names;
    }
    return null;
}
public EList<String> getRegularsAfter1(EObject self) {
    if (self instanceof Cycle) {
        EList<String> names = new BasicEList<>();

        // Add regulars from current Cycle
        if (((Preprocess) self).getRegular() != null) {
            EList<Regular> currentRegulars = ((Preprocess) self).getRegular();
            for (Regular regular : currentRegulars) {
                names.add(regular.getName());
            }
        }

        Cycle currentCycle = ((Preprocess) self).getAfter();
        while (currentCycle != null && !(currentCycle instanceof CSV)) {
            if (currentCycle instanceof OneHot) {
                if (((Preprocess) currentCycle).getRegular() != null) {
                    EList<Regular> cycleRegulars = ((Preprocess) currentCycle).getRegular();
                    for (Regular regular : cycleRegulars) {
                        names.add(regular.getName());
                    }
                }
            }
            currentCycle = currentCycle.getAfter();
        }

        return names;
    }
    return null;
}
//end audit onehot



//start audit normalized



public List<String> normalized(Scaling self) {
    List<String> result3 = getCategoricalColumnNames(self);

    List<String> regularNames = new ArrayList<>(); 
    Cycle currentAfter = self.getBefore();
    while (currentAfter != null) {
        if (currentAfter instanceof Encoding) {
            EList<Regular> a = ((Preprocess) currentAfter).getRegular();
            for (Regular regular : a) {
                regularNames.add(regular.getName());
            }
        }
        currentAfter = currentAfter.getBefore();
    }

    Set<String> regularNamesSet = regularNames.stream()
                                               .map(String::toLowerCase)
                                               .collect(Collectors.toSet());

    List<String> difference = result3.stream()
                                     .filter(name -> !regularNamesSet.contains(name.toLowerCase()))
                                     .collect(Collectors.toList());

    return difference;
}

public String normalized1(Scaling self) {
    List<String> a = normalized(self);
    if (a != null && !a.isEmpty()) {
        return "These categorical variables are not handled: " + a;
    }
    return null;
}




///image if
public boolean statistics_values1(EObject self) {
    EList<Plots> plotsList = ((Visualization) self).getData_und_plots(); 
    
    boolean hasScatter = false;
    boolean hasBar = false;

    for (Plots plot : plotsList) {
        if (plot instanceof Scatter) {
            hasScatter = true;
        } else if (plot instanceof Bar) {
            hasBar = true;
        }
    }

    return hasScatter && hasBar;

}

public boolean statistics_values2(EObject self) {
    EList<Plots> plotsList = ((Visualization) self).getData_und_plots(); 
    
    if (plotsList == null || plotsList.isEmpty()) {
        return false;
    }
    
    for (Plots plot : plotsList) {
        if (plot instanceof Scatter) {
            return true;
        }
    }
    
    return false; 
}

public boolean statistics_values3(EObject self) {
    EList<Plots> plotsList = ((Visualization) self).getData_und_plots(); 
    
    if (plotsList == null || plotsList.isEmpty()) {
        return false;
    }
    
    for (Plots plot : plotsList) {
        if (plot instanceof Bar) {
            return true;
        }
    }
    
    return false; 
}

/////
public List<String> analyzeData1(EObject self) {
    ReadData reader = new ReadData();
    String filepath = reader.mm1(self);
    if (filepath == null || filepath.isEmpty()) {
        return List.of("Error: Root File Path is not available.");
    }

    try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
        String line;
        String[] variableTitles = null;
        List<List<Double>> columnData = new ArrayList<>();
        int chunkSize = 1000; 
        boolean hasOutliers = false;

        while ((line = br.readLine()) != null) {
            if (variableTitles == null) {
                variableTitles = line.split(",");
                for (int i = 0; i < variableTitles.length; i++) {
                    columnData.add(new ArrayList<>());
                }
                continue;
            }

            String[] values = line.split(",");
            for (int i = 0; i < values.length; i++) {
                if (isNumeric1(values[i])) {
                    columnData.get(i).add(Double.parseDouble(values[i]));
                }
            }

            if (columnData.get(0).size() >= chunkSize) {
                List<List<Double>> zScores = calculateZScores1(columnData);
                hasOutliers = hasOutliers1(zScores) || hasOutliers; 

                drawScatterPlot(variableTitles, zScores, 3.0);

                for (List<Double> column : columnData) {
                    column.clear();
                }
            }
        }

        if (!columnData.get(0).isEmpty()) {
            List<List<Double>> zScores = calculateZScores1(columnData);
            hasOutliers = hasOutliers1(zScores) || hasOutliers;

            drawScatterPlot(variableTitles, zScores, 3.0);
        }

        return hasOutliers ? List.of("The dataset contains outliers.") : List.of("No outliers found in the dataset.");

    } catch (IOException e) {
        e.printStackTrace();
        return List.of("Error: Unable to analyze data. " + e.getMessage());
    }
}
private List<List<Double>> calculateZScores1(List<List<Double>> columnData) {
    List<List<Double>> zScores = new ArrayList<>();
    for (List<Double> column : columnData) {
        double mean = calculateMean1(column);
        double stdDev = calculateStandardDeviation1(column);

        List<Double> columnZScores = new ArrayList<>();
        for (Double value : column) {
            double zScore = (value - mean) / stdDev;
            columnZScores.add(zScore);
        }
        zScores.add(columnZScores);
    }
    return zScores;
}

private boolean hasOutliers1(List<List<Double>> zScores) {
    double outlierThreshold = 3.0;
    for (List<Double> column : zScores) {
        for (Double zScore : column) {
            if (Math.abs(zScore) > outlierThreshold) {
                return true;
            }
        }
    }
    return false;
}

private boolean isNumeric1(String str) {
    try {
        Double.parseDouble(str);
        return true;
    } catch (NumberFormatException e) {
        return false;
    }
}

private double calculateMean1(List<Double> values) {
    double sum = 0.0;
    for (Double value : values) {
        sum += value;
    }
    return sum / values.size();
}

private double calculateStandardDeviation1(List<Double> values) {
    double mean = calculateMean1(values);
    double sumSquaredDeviations = 0.0;
    for (Double value : values) {
        sumSquaredDeviations += Math.pow(value - mean, 2);
    }
    return Math.sqrt(sumSquaredDeviations / values.size());
}


private void drawZScoreChart1(String[] variableTitles, List<List<Double>> zScores, double zScoreThreshold) {
    JFrame frame = new JFrame("Z-Score Outliers Chart");
    frame.setSize(1200, 800);
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    JPanel panel = new JPanel() {
        private static final long serialVersionUID = 1L;

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;

            // Anti-aliasing for better graphics quality
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            int width = getWidth();
            int height = getHeight();
            int barWidth = (int) (width / (1.5 * variableTitles.length + 1)); // Adjust bar width based on panel width
            int maxBarHeight = (height - 200) / 2; // Height space for bars on either side of the center line

            // Center line position (middle of the panel height)
            int centerY = height / 2;

            // Draw horizontal grid lines and labels for Y-axis
            g2d.setColor(Color.LIGHT_GRAY);
            int numGridLines = 10;
            for (int i = -numGridLines; i <= numGridLines; i++) {
                int y = centerY - i * maxBarHeight / numGridLines;
                g2d.drawLine(50, y, width - 50, y);
                g2d.drawString(String.format("%.1f", zScoreThreshold * (i / (double) numGridLines)), 30, y);
            }

            // Draw threshold lines for Z-score (+3 and -3)
            int thresholdYPos = centerY - (int)(zScoreThreshold * maxBarHeight / zScoreThreshold);
            int thresholdYNeg = centerY + (int)(zScoreThreshold * maxBarHeight / zScoreThreshold);
            g2d.setColor(Color.RED);
            g2d.drawLine(50, thresholdYPos, width - 50, thresholdYPos);
            g2d.drawLine(50, thresholdYNeg, width - 50, thresholdYNeg);
            g2d.drawString("Threshold: +" + zScoreThreshold, width - 150, thresholdYPos - 5);
            g2d.drawString("Threshold: -" + zScoreThreshold, width - 150, thresholdYNeg - 5);

            // Draw bars for Z-scores
            for (int i = 0; i < variableTitles.length; i++) {
                int x = (int) ((1.5 * i + 0.5) * barWidth + 50); // Adjust bar spacing

                for (Double zScore : zScores.get(i)) {
                    int barHeight = (int) (Math.abs(zScore) * maxBarHeight / zScoreThreshold);
                    int y;

                    if (zScore >= 0) {
                        // Draw positive Z-scores upwards from the center line
                        y = centerY - barHeight;
                    } else {
                        // Draw negative Z-scores downwards from the center line
                        y = centerY;
                    }

                    Color barColor = Math.abs(zScore) >= zScoreThreshold ? Color.RED : Color.BLUE;
                    g2d.setColor(barColor);
                    g2d.fillRect(x, y, barWidth, barHeight);
                    g2d.setColor(Color.BLACK);
                    g2d.drawRect(x, y, barWidth, barHeight);

                    // Draw Z-score values on the bars only if there's enough space
                    if (barHeight > 20) {
                        int textY = zScore >= 0 ? y - 5 : y + barHeight + 15;
                        g2d.drawString(String.format("%.2f", zScore), x + barWidth / 2 - 15, textY);
                    }
                }

                // Draw the variable titles at an angle to avoid overlap
                g2d.setColor(Color.BLACK);
                g2d.rotate(-Math.PI / 4, x + barWidth / 2, height - 20);
                g2d.drawString(variableTitles[i], x + barWidth / 2 - 20, height - 20);
                g2d.rotate(Math.PI / 4, x + barWidth / 2, height - 20);
            }

            // Draw x-axis label
            g2d.drawString("Variables", width / 2 - 20, height - 5);

            // Draw y-axis label rotated
            g2d.rotate(-Math.PI / 2);
            g2d.drawString("Z-Score", -height / 2 - 20, 20);
            g2d.rotate(Math.PI / 2);

            // Draw y-axis line
            g2d.drawLine(50, 50, 50, height - 100);

            // Draw x-axis line (center line)
            g2d.drawLine(50, centerY, width - 50, centerY);
        }
    };

    // Add JScrollPane for better handling of large number of variables
    JScrollPane scrollPane = new JScrollPane(panel);
    frame.add(scrollPane);
    frame.setVisible(true);
}


private void drawScatterPlot(String[] variableTitles, List<List<Double>> zScores, double zScoreThreshold) {
    JFrame frame = new JFrame("Z-Score Scatter Plot");
    frame.setSize(1200, 800);
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    JPanel panel = new JPanel() {
        private static final long serialVersionUID = 1L;

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;

            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            int width = getWidth();
            int height = getHeight();

            int margin = 50;
            int plotWidth = width - 2 * margin;
            int plotHeight = height - 2 * margin;

            int centerY = margin + plotHeight / 2;

            double maxZScore = zScores.stream()
                                      .flatMap(List::stream)
                                      .mapToDouble(Math::abs)
                                      .max()
                                      .orElse(1.0);

            double scaleY = plotHeight / (2 * maxZScore);

            g2d.setColor(Color.BLACK);
            g2d.drawLine(margin, centerY, width - margin, centerY); // X-axis
            g2d.drawLine(margin, margin, margin, height - margin); // Y-axis

            int thresholdYPos = centerY - (int) (zScoreThreshold * scaleY);
            int thresholdYNeg = centerY + (int) (zScoreThreshold * scaleY);
            g2d.setColor(Color.RED);
            g2d.drawLine(margin, thresholdYPos, width - margin, thresholdYPos);
            g2d.drawLine(margin, thresholdYNeg, width - margin, thresholdYNeg);
            g2d.drawString("Threshold: +" + zScoreThreshold, width - margin - 100, thresholdYPos - 5);
            g2d.drawString("Threshold: -" + zScoreThreshold, width - margin - 100, thresholdYNeg - 5);

            int spacingX = plotWidth / variableTitles.length;
            for (int i = 0; i < variableTitles.length; i++) {
                int x = margin + i * spacingX + spacingX / 2;

                for (Double zScore : zScores.get(i)) {
                    int y = centerY - (int) (zScore * scaleY);
                    Color pointColor = Math.abs(zScore) >= zScoreThreshold ? Color.RED : Color.BLUE;
                    g2d.setColor(pointColor);
                    g2d.fillOval(x - 4, y - 4, 8, 8);
                }

                g2d.setColor(Color.BLACK);
                g2d.drawString(variableTitles[i], x - 15, height - margin + 20);
            }

            g2d.setColor(Color.BLACK);
            int numYLabels = 10;
            for (int i = -numYLabels; i <= numYLabels; i++) {
                int y = centerY - i * plotHeight / (2 * numYLabels);
                g2d.drawLine(margin - 5, y, margin + 5, y);
                g2d.drawString(String.format("%.1f", maxZScore * (i / (double) numYLabels)), margin - 40, y + 5);
            }

            g2d.drawString("Variables", width / 2 - 30, height - 10);

            g2d.rotate(-Math.PI / 2);
            g2d.drawString("Z-Score", -height / 2 - 30, 20);
            g2d.rotate(Math.PI / 2);
        }
    };

    JScrollPane scrollPane = new JScrollPane(panel);
    frame.add(scrollPane);
    frame.setVisible(true);
}


public String PCAConnect(EObject self) {



    Cycle current = (Cycle) self;
    boolean foundCSVData = false;

    while (current != null) {
        if (current instanceof CSV) {
            foundCSVData = true;
            break;
        }
        if (current.getBefore() == null) {
            break; 
        }
        current = current.getBefore();
    }

    if (!foundCSVData) {
        return "Please Connect the Connection between operator PCA and Read Data.";
    }
    	return null;

}


public String DateConnect(EObject self) {
    Cycle current = (Cycle) self;
    boolean foundCSVData = false;

    while (current != null) {
        if (current instanceof CSV) {
            foundCSVData = true;
            break;
        }
        if (current.getBefore() == null) {
            break; 
        }
        current = current.getBefore();
    }

    if (!foundCSVData) {
        return "Please Connect the Connection between operator Date to Int and Read Data.";
    }
    	return null;

}

public String Connecttodata(EObject self) {
    Cycle current = (Cycle) self;
    boolean foundCSVData = false;

    while (current != null) {
        if (current instanceof CSV) {
            foundCSVData = true;
            break;
        }
        if (current.getBefore() == null) {
            break; 
        }
        current = current.getBefore();
    }

    if (!foundCSVData) {
        return "Please Connect the Connection between operator and Read Data.";
    }
    	return null;

}


public boolean name(EObject self) {
	EList<Set_Role> a = ((Import_Data) self).getRole();
    for (Set_Role role : a) {
        if (role instanceof Target) {
            return true;
        }
    }
	return false;
	
}



//knn audit

public List<String> getcat(Classification self) {
    List<String> result3 = getCategoricalColumnNames(self);

    List<String> regularNames = new ArrayList<>(); 
    Cycle currentAfter = self.getBefore();
    while (currentAfter != null) {
        if (currentAfter instanceof Encoding) {
            EList<Regular> a = ((Preprocess) currentAfter).getRegular();
            for (Regular regular : a) {
                regularNames.add(regular.getName());
            }
        }
        currentAfter = currentAfter.getBefore();
    }

    Set<String> regularNamesSet = regularNames.stream()
                                               .map(String::toLowerCase)
                                               .collect(Collectors.toSet());

    List<String> difference = result3.stream()
                                     .filter(name -> !regularNamesSet.contains(name.toLowerCase()))
                                     .collect(Collectors.toList());

    return difference;
}

public boolean KNNaudit(Classification self) {
    List<String> a = getcat(self);
    if (a != null && !a.isEmpty()) {
        return false;
    }
    return true;
}


//end

//manage all categorical data Classification

public List<String> getcattype(Classification self) {
    List<String> regularNames = new ArrayList<>();
    Cycle currentAfter = self.getBefore();

    while (currentAfter != null) {
        if (currentAfter instanceof CSV) {
            CSV csv = (CSV) currentAfter;
            EList<Set_Role> roles = csv.getRole();

            for (Set_Role role : roles) {
                if (role instanceof Regular) {
                    Regular regular = (Regular) role;
                    if (regular.getType() == Attribiutes_Type.CATEGORICAL) { // Check if the type is categorical
                        regularNames.add(regular.getName());
                    }
                }
            }
        }
        currentAfter = currentAfter.getBefore();
    }

    return regularNames;
}


public List<String> getonehot(Classification self) {

    List<String> regularNames = new ArrayList<>(); 
    Cycle currentAfter = self.getBefore();
    while (currentAfter != null) {
        if (currentAfter instanceof Encoding) {
            EList<Regular> a = ((Preprocess) currentAfter).getRegular();
            for (Regular regular : a) {
                regularNames.add(regular.getName());
            }
        }
        currentAfter = currentAfter.getBefore();
    }

	return regularNames;


}

public String returncomparecat(Classification self) {
    List<String> cattypes = getcattype(self); 
    List<String> catmanage = getonehot(self);

    if (cattypes.size() != catmanage.size()) {
        return "The number of categorical values does not match.";
    }

    // Create sets for comparison
    Set<String> cattypesSet = new HashSet<>(cattypes);
    Set<String> catmanageSet = new HashSet<>(catmanage);

    // Check if sets are equal
    if (cattypesSet.equals(catmanageSet)) {
        return "All categorical values have been managed.";
    } else {
        return "Please manage the categorical values.";
    }
}


public boolean returncomparecat1(Classification self) {
    List<String> cattypes = getcattype(self); 
    List<String> catmanage = getonehot(self);

    if (cattypes.size() != catmanage.size()) {
        return false;
    }

    // Create sets for comparison
    Set<String> cattypesSet = new HashSet<>(cattypes);
    Set<String> catmanageSet = new HashSet<>(catmanage);

    // Check if sets are equal
    if (cattypesSet.equals(catmanageSet)) {
        return true;
    } else {
        return false;
    }
}

//End

//manage datetype

public List<String> getdatetype(Classification self) {
    List<String> regularNames = new ArrayList<>();
    Cycle currentAfter = self.getBefore();

    while (currentAfter != null) {
        if (currentAfter instanceof CSV) {
            CSV csv = (CSV) currentAfter;
            EList<Set_Role> roles = csv.getRole();

            for (Set_Role role : roles) {
                if (role instanceof Regular) {
                    Regular regular = (Regular) role;
                    if (regular.getType() == Attribiutes_Type.DATE) { // Check if the type is categorical
                        regularNames.add(regular.getName());
                    }
                }
            }
        }
        currentAfter = currentAfter.getBefore();
    }

    return regularNames;
}


public List<String> getdate(Classification self) {

    List<String> regularNames = new ArrayList<>(); 
    Cycle currentAfter = self.getBefore();
    while (currentAfter != null) {
        if (currentAfter instanceof Date_to_Int) {
            EList<Regular> a = ((Preprocess) currentAfter).getRegular();
            for (Regular regular : a) {
                regularNames.add(regular.getName());
            }
        }
        currentAfter = currentAfter.getBefore();
    }

	return regularNames;


}

public boolean returncomparedate(Classification self) {
    List<String> cattypes = getdatetype(self); 
    List<String> catmanage = getdate(self);

    if (cattypes.size() != catmanage.size()) {
        return false;
    }

    // Create sets for comparison
    Set<String> cattypesSet = new HashSet<>(cattypes);
    Set<String> catmanageSet = new HashSet<>(catmanage);

    // Check if sets are equal
    if (cattypesSet.equals(catmanageSet)) {
        return true;
    } else {
        return false;
    }
}

//End

//auto prep

public boolean beforeauto(Auto_Prep self) {

    Cycle currentAfter = self.getBefore();
         if (currentAfter instanceof Import_Data) {
           return true;
        }
       
	return false;


}

public boolean afterauto(Auto_Prep self) {

    Cycle currentAfter = self.getAfter();
         if (currentAfter instanceof Classification) {
           return true;
        }
       
	return false;


}
//end

//manage knn normalization

public List<String> getdatetype1(EObject self) {
  List<String> regularNames = new ArrayList<>();
  Cycle currentAfter = ((Cycle) self).getBefore();

  while (currentAfter != null) {
      if (currentAfter instanceof CSV) {
          CSV csv = (CSV) currentAfter;
          EList<Set_Role> roles = csv.getRole();

          for (Set_Role role : roles) {
              if (role instanceof Regular) {
                  Regular regular = (Regular) role;
                  if (regular.getType() == Attribiutes_Type.INTEGER || regular.getType() == Attribiutes_Type.FLOAT) { // Check if the type is Numerical
                      regularNames.add(regular.getName());
                  }
              }
          }
      }
      currentAfter = currentAfter.getBefore();
  }

  return regularNames;
}


public boolean getdate1(Classification self) {

  Cycle currentAfter = self.getBefore();
  while (currentAfter != null) {
      if (currentAfter instanceof Scaling) {
    	  
    	  return true;

      }
      currentAfter = currentAfter.getBefore();
  }

	return false;


}

public boolean returncomparedate1(Classification self) {
    List<String> cattypes = getdatetype1(self); 
    boolean catmanage = getdate1(self);

    if (catmanage == false && (cattypes != null && !cattypes.isEmpty())) {
        return false;
    }

    return true;
}

//End


public List<String> nummiss(EObject self) {
    List<String> result2 = missindataset(self);
    List<String> cattypes = getdatetype1((EObject) self); 
    result2.retainAll(cattypes);
    return result2;
}



}







	







