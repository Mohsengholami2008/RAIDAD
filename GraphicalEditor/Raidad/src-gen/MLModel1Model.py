import numpy as np
import warnings
np.warnings = warnings
import pandas as pd
from sklearn.preprocessing import StandardScaler, RobustScaler, MinMaxScaler










def scale_features(data, scaling_config):
    scaled_data = data.copy()  

    for method, columns in scaling_config.items():
        scaler = None
        if columns:  
            if method == "standardization":
                scaler = StandardScaler()
            elif method == "minmax":
                scaler = MinMaxScaler()
            elif method == "robust":
                scaler = RobustScaler()
            if scaler:
                scaler.fit(data[columns])
                scaled_columns = scaler.transform(data[columns])
                scaled_data[columns] = scaled_columns

    return scaled_data

































def process_data(, , scaling_config=None): 
	executed_functions = []
	model = None	

	a =['invalid','invalid','invalid']

	for letter in range (len(a)):





		if a[letter] == 'scaling_config':
			data = scale_features(data, scaling_config)
			scaling_methods = [method for method in scaling_config if method != "exclude"]
			executed_functions.extend(scaling_methods)




























	return data, executed_functions, model












    scaling_config = {
		'minmax': [],


}



































    scoring_metrics = {
    }

    processed_data, executed_functions = process_data(



 
















 







        scaling_config=scaling_config,
		










 















		
		


    )



