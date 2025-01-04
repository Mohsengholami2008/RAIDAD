# ![RAIDAD Logo](images/photo16051329028.jpg)

# RAIDAD  

**RAIDAD: A Model-Driven Framework for Automated and Agile Development of IoT Data Analysis Software**  

RAIDAD is a Model-Driven Software Engineering (MDSE) tool designed for the automated and agile development of data analysis software in the Internet of Things (IoT) domain. This tool is built based on the CRISP-DM standard and supports various stages of the data analysis lifecycle.  

RAIDAD is a model-driven framework designed to streamline the development of IoT data analysis applications. The name 'RAIDAD' represents the framework's core principles: **Rapid**, **Adaptive**, **Intelligent**, and **Data-Aware development**, aimed at optimizing the data analysis process for IoT systems.


## Why RAIDAD?  

The development of data analysis software for IoT applications is often a complex, time-consuming process, requiring expertise in programming, statistics, and data management. Existing model-driven approaches fall short in comprehensively addressing the full lifecycle of data analysis as outlined in the CRISP-DM methodology. Moreover, they do not establish a direct and continuous relationship between data and models throughout the modeling process.  

**RAIDAD** bridges this gap by offering a comprehensive, model-driven framework tailored for IoT data analysis. Unlike traditional model-driven tools, RAIDAD incorporates the following unique features:  

- **Domain-Specific Modeling Language (DSML):** Designed specifically to represent IoT data analysis workflows, enabling developers to abstract away low-level complexities while focusing on domain-specific tasks.  
- **Data Model Assistant (DMA):** Realizes data-aware model-driven engineering for data analysis software development by introducing a DMA module, ensuring seamless integration into the modeling process with real-time insights and adjustments.  
- **Automation-Driven Code Generation:** Automatically generates Python code for data analysis pipelines, from preprocessing to model evaluation, reducing development time significantly.  
- **Flexibility and Scalability:** Supports advanced machine learning and data analytics techniques, allowing for integration with popular libraries like Scikit-Learn, Keras, and PyClustering.  

RAIDAD stands out by unifying data-driven and model-driven paradigms. It ensures that developers can efficiently create, evaluate, and refine IoT data analysis applications without being overwhelmed by repetitive tasks or the need for extensive domain knowledge.  

# Table of Contents
- [Introducing RAIDAD](#introducing-raidad)
- [Reporting Issues/Bugs and Requests](#reporting-issuesbugs-and-requests)
- [RAIDAD Feature Model](#RAIDAD-Feature-Model)
- [Supported Techniques and Algorithms](#supported-techniques-and-algorithms)
- [RAIDAD Quick Start Tutorial (10 Minutes)](#raidad-quick-start-tutorial-10-minutes)
- [Users' Documentation (Full Tutorial)](#users-documentation-full-tutorial)
   - [Introduction](#introduction)
   - [Basic Usage](#basic-usage)
   - [Automated Troubleshooting](#automated-troubleshooting)
   - [Message Types](#message-types)
   - [Data Analysis Pipeline](#data-analysis-pipeline)
   - [Code Generation](#code-generation)

## Introducing RAIDAD
RAIDAD is a framework powered by Model-Driven Software Engineering. We **recommend** that you **watch the introductory video about RAIDAD on our YouTube channel before getting started**. The video is **2.45 minutes** long.

[![Watch the video]](https://youtu.be/cB2dwR4HSmE)




[Back to top](#table-of-contents)


## Reporting Issues/Bugs and Requests

RAIDAD is an open-source research project, and we highly appreciate your feedback. If you encounter any issues, bugs, or have any requests, please report them to us through our issue tracking system: [https://github.com/Mohsengholami2008/RAIDAD/issues](https://github.com/Mohsengholami2008/RAIDAD/issues). 

We value these reports as they are essential for improving RAIDAD. Thank you for helping us enhance the project.

[Back to top](#table-of-contents)


## RAIDAD Feature Model
A widely used approach for domain analysis is the feature model. We utilized the Feature-Oriented Domain Analysis (FODA) method. For feature extraction from various software, libraries, papers, and articles, we used tools such as RapidMiner, SPSS Modeler, Weka, Orange, Keras, Scikit-learn, PyClustering, AutoClien, CRISP-DM, AutoPrep, and ML-Quadrat. Ultimately, the RAIDAD feature model is illustrated in Figure 1.

![RAIDAD Feature Model](images/FM.png)

<p align="center"><em>Figure 1. RAIDAD Feature Model</em></p>



[Back to top](#table-of-contents)



## Supported Techniques and Algorithms

RAIDAD not only performs a wide range of data- and model-based analyses in real-time during the modeling process but also leverages libraries such as Keras, scikit-learn, and PyClustering for code generation. The following techniques and algorithms are currently supported by RAIDAD:

- **Data Understanding:**
  - Visualization
  - Statistics
  - Correlation
  - Standard Deviation
  - Outlayer

- **Data Preprocessing:**
  - **Simple Imputation:**
    - Median Imputation
    - Mean Imputation
    - Robust Scaling
    - Manual Filling
  - **k-Nearest Neighbors (kNN) Imputation**
  - **Scaling:**
    - Normalization
    - Standardization
    - Robust Scaling
  - **Encoding:**
    - OneHot
  - **Duplicate**
  - **Transformation**
  - **Dimentialy Reduction**
    - Principal component analysis (PCA)
  - **Auto Preprocess**

- **Machine Learning Algorithms:**
  - **Classification:**
    - **Ensembling:**
      - Voting (Hard & Soft)
      - Random Forest
    - k-Nearest Neighbors (kNN)
    - Support Vector Machines (SVM)
    - Multi-Layer Perceptron (MLP)
    - Linear Regression
  - **Clustering:**
    - DBSCAN
    - OPTICS
    - k-Median
    - k-Means
- **Evaluation:**
  - Clustering Evaluation
  - Classification Evaluation
  - Evaluation Visualization



These techniques and algorithms are integrated into the RAIDAD framework to facilitate efficient and robust data analysis.

[Back to top](#table-of-contents)





## RAIDAD Quick Start Tutorial (10 Minutes)
A 10-minute video tutorial on how to work with the RAIDAD framework is available on our YouTube channel. You can watch it here: [Watch the video](https://www.youtube.com/******).

[Back to top](#table-of-contents)


## Users' Documentation (Full Tutorial)

### Introduction

RAIDAD leverages a user-friendly graphical editor powered by Sirius to facilitate modeling. It is structured around three core components:  

1. **Toolbox**:  
   The toolbox provides essential language elements aligned with the designed metamodel, encompassing:  
   - **Process Design**: Enables the creation of the data analysis process and flow for software.  
   - **Tools**: Defines relationships between concepts in the model and their execution sequence.  
   - **Import Data**: Offers tools to load various dataset formats.  
   - **CRISP-DM Methodology Phases**: Covers Data Understanding, Preprocessing, Data Analysis, Modeling, and Evaluation.  
   - **Auto Preprocess**: Automates data preprocessing through predefined pipelines.  
   Each element may include sub-elements, as illustrated in Figure 2, which elaborates on the hierarchical structure of the toolbox.  

2. **Design Environment**:  
   This graphical editor allows developers to model by dragging and dropping tools and their sub-elements from the toolbox. The environment provides functionality to view and modify the models seamlessly.  

3. **Custom Properties View**:  
   Developers can manage the properties of the elements added to the design environment in this section, enabling them to customize or update the model properties dynamically.  

![RAIDAD's Graphical Editor](images/Graphical_Editor.png)

<p align="center"><em>Figure 2. RAIDAD's Graphical Editor</em></p>


[Back to Full Tutorial](#users-documentation-full-tutorial)


### Basic Usage

The first step in creating a model in RAIDAD involves using the **Process** concept. Next, the dataset path is specified in its parameter section. This is an essential initial step where the modeler introduces their dataset to the tool.

The next step is to create the dataset attributes and define their names, types, and roles. This is a crucial step because the model's concepts will act upon these attributes. Our DMA automatically detects column names and types, instantiating them accordingly. However, the modeler can also perform this instantiation manually if needed.

The choice of which concept to use for creating dataset attributes directly depends on the dataset format. However, DMA has the capability to automatically create the appropriate concept for the modeler based on the dataset format.
To add other concepts to the data analysis pipeline, drag-and-drop functionality should be used. However, the sequence and order of this pipeline are determined by defining the "After" and "Before" relationships, which is an essential step in creating RAIDAD pipelines.



<p align="center">
  <img src="images/Relation.png" alt="Creating a sequence using 'After' and 'Before' relationships">
</p>

<p align="center"><em>Figure 3.Creating a sequence using "After" and "Before" relationships</em></p>



[Back to Full Tutorial](#users-documentation-full-tutorial)


## Automated Troubleshooting
One of the capabilities of RAIDAD is automatic error detection and an attempt to automatically fix the errors. For error detection, in addition to the automatic tooltips, the use of "Validate diagram" is essential, which displays errors, warnings, and notifications to the modeler.
<p align="center">
  <img src="images/diagram-validation.png" alt="Automatic error detection">
</p>

<p align="center"><em>Figure 4.Automatic error detection</em></p>

The Autofix process of the tool automatically attempts to resolve the errors that have been created.


<p align="center">
  <img src="images/autofix.png" alt="Automatic error correction">
</p>

<p align="center"><em>Figure 5.Automatic error correction</em></p>









[Back to Full Tutorial](#users-documentation-full-tutorial)

## Message Types
There are four types of messages in RAIDAD. Tooltips appear automatically during modeling. For example, in Figure 6, a number of unmanaged attributes with missing values are shown to the modeler.
<p align="center">
  <img src="images/tooltip.png" alt="Tooltips in RAIDAD">
</p>

<p align="center"><em>Figure 6.Tooltips in RAIDAD</em></p>

Based on their severity, the three other categories of messages—errors, warnings, and notifications—are displayed, as shown in Figure 7.

<p align="center">
  <img src="images/messages.png" alt="Types of errors in RAIDAD">
</p>

<p align="center"><em>Figure 7.Types of errors in RAIDAD</em></p>


[Back to Full Tutorial](#users-documentation-full-tutorial)

## Data Analysis Pipeline
Figure 8 illustrates a pipeline created by RAIDAD, which is formed from the interaction between various concepts, data states, and created elements. These concepts include importing the dataset, a set of data understanding concepts, preprocessing, modeling, evaluation, and visualization of the results.


<p align="center">
  <img src="images/GME.png" alt="Data analysis pipeline">
</p>

<p align="center"><em>Figure 8.Data analysis pipeline</em></p>




[Back to Full Tutorial](#users-documentation-full-tutorial)

## Code Generation
Model-to-code generation in the RAIDAD framework leverages the Acceleo language, a powerful model-to-text transformation tool based on the Eclipse Modeling Framework (EMF). Acceleo allows for the seamless transformation of models into executable code by utilizing templates specifically designed to map model elements to code constructs. Within RAIDAD, this process ensures that the abstract representations of data analysis workflows and IoT-related concepts are accurately translated into efficient, executable Python code. The final Python code is tailored to meet the requirements of data analysis and model-driven engineering tasks, supporting the rapid and adaptive development of IoT data analysis solutions.






[Back to Full Tutorial](#users-documentation-full-tutorial)

[Back to top](#table-of-contents)


