# CustomToasta
CustomToast-Kotlin - Types of Toast Style ❤️
 
<table style="width:100%">
  <tr>
    <th>1. Info Toasta </th>
    <th>2. Success Toasta </th> 
    <th>3. Warning Toasta </th>
    <th>4. Error Toasta </th> 
    <th>5. Basic Toasta </th> 

   </tr>
  <tr>
    <td><img src = "https://github.com/Ahmedomarpro/CustomToasta/blob/master/app/src/main/res/Screenshots/Screenshot_20200402-103317.png?raw=true"/></td> 
    <td><img src = "https://github.com/Ahmedomarpro/CustomToasta/blob/master/app/src/main/res/Screenshots/Screenshot_20200402-103329.png?raw=true"/></td>
    <td><img src = "https://github.com/Ahmedomarpro/CustomToasta/blob/master/app/src/main/res/Screenshots/Screenshot_20200402-103334.png?raw=true"/></td> 
    <td><img src = "https://github.com/Ahmedomarpro/CustomToasta/blob/master/app/src/main/res/Screenshots/Screenshot_20200402-103348.png?raw=true "/></td> 
    <td><img src = "https://github.com/Ahmedomarpro/CustomToasta/blob/master/app/src/main/res/Screenshots/Screenshot_20200402-103353.png?raw=true "/></td>      
     </tr>
</table>
## About

A Beautiful CustomToasta in Android using Kotlin. 

## Five Toast Types 🖐🏼
``` 
    1. Info Toasta  
    2. Success Toasta   
    3. Warning Toasta  
    4. Error Toasta  
    5. Basic Toasta  
    
```
## Toast Duration ⌛️ 
```
        1. LONG_DURATION // 4 Seconds
        2. SHORT_DURATION // 2 Seconds
       
```
## Usage 

# Sample Code for - CustomToasta 🌟 

### 1- Info Toasta  
<img src="https://github.com/Ahmedomarpro/CustomToasta/blob/master/app/src/main/res/Screenshots/Screenshot_20200402-103317.png" width="210px" />


```
 fun makeInfoToast() {
        makeToast(this, "This is an Info Toast Message").show()
        
       // Toasta.makeToast(this, "This is an Info Toast Message").show()
    }


```
### 2. Success Toasta   
<img src="https://github.com/Ahmedomarpro/CustomToasta/blob/master/app/src/main/res/Screenshots/Screenshot_20200402-103329.png" width="210px" />


```
fun makeSuccessToasta() {
        makeToast(
            this,
            "This is a Success Toast Message",
            Toasta.CUSTOM_DURATION_SHORT,
            Toasta.CUSTOM_TYPE_SUCCESS,
            Toasta.CUSTOM_GRAVITY_TOP
        ).show()

    }

```
### 3. Warning Toasta
<img src="https://github.com/Ahmedomarpro/CustomToasta/blob/master/app/src/main/res/Screenshots/Screenshot_20200402-103334.png" width="210px" />


```
 fun makeWarningToasta() {
        Toasta.makeToast(
            this,
            "This is a Warning Toast Message",
            Toasta.CUSTOM_DURATION_SHORT,
            Toasta.CUSTOM_TYPE_WARNING,
            Toasta.CUSTOM_GRAVITY_CENTER
        ).show()
    }


```
### 4. Error Toasta
<img src="https://github.com/Ahmedomarpro/CustomToasta/blob/master/app/src/main/res/Screenshots/Screenshot_20200402-103348.png" width="210px" />


```
fun makeErrorToasta() {
        makeToast(
            this,
            "This is an Error Toast Message",
            Toasta.CUSTOM_DURATION_LONG,
            Toasta.CUSTOM_TYPE_ERROR
        ).show()
    }
    
```
### 5. Basic Toasta 
<img src="https://github.com/Ahmedomarpro/CustomToasta/blob/master/app/src/main/res/Screenshots/Screenshot_20200402-103353.png" width="210px" />


```
   fun makeToastabasic() {
        Toast.makeText(this, "This is an Basic Toast Message", Toast.LENGTH_SHORT).show()
    }

```

### run Btn 
```
 fun btnView() {
        button.setOnClickListener {
            makeInfoToasta()

        }
        button2.setOnClickListener {
            makeSuccessToasta()
        }
        button3.setOnClickListener {
            makeWarningToasta()
        }
        button4.setOnClickListener {
            makeErrorToasta()
        }
        button5.setOnClickListener {
            makeToastabasic()
        }

    }



```

