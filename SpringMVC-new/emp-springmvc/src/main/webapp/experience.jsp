<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <!-- <link   href="bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet"> -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

    <title>Employee Experience Details</title>
</head>
<body >
    <legend class="h3" style="text-align: center;">Employee Experience Details</legend>  
<br>
        <form class="form-horizontal">
                <fieldset>
                               
                
              

                
                <!-- Prepended text http://getbootstrap.com/components/#input-groups -->
                <div class="form-group">
                  <label class="control-label col-sm-4" for="id"></label>
                  <div class="col-sm-4">
                    <div class="input-group">
                      <span id="idPrepend" class="input-group-addon">ID</span>
                      <input id="id" name="id" class="form-control" placeholder="Enter Educational ID" type="number">
                      
                    </div>
                    
                  </div>
                </div>
                
                <!-- Prepended text http://getbootstrap.com/components/#input-groups -->
                <div class="form-group">
                  <label class="control-label col-sm-4" for="company"></label>
                  <div class="col-sm-4">
                    <div class="input-group">
                      <span id="companyPrepend" class="input-group-addon">Company Name</span>
                      <input id="company" name="company" class="form-control" placeholder="Enter Company Name" type="text">
                      
                    </div>
                    
                  </div>
                </div>

                  <!-- Prepended text http://getbootstrap.com/components/#input-groups -->
                  <div class="form-group">
                        <label class="control-label col-sm-4" for="company"></label>
                        <div class="col-sm-4">
                          <div class="input-group">
                            <span id="companyPrepend" class="input-group-addon">Desingnation</span>
                            <input id="desingnation" name="desingnation" class="form-control" placeholder="Enter Desingnation" type="text">
                            
                          </div>
                          
                        </div>
                      </div>

                
                
                <!-- Prepended text http://getbootstrap.com/components/#input-groups -->
                <div class="form-group">
                  <label class="control-label col-sm-4" for="joining"></label>
                  <div class="col-sm-4">
                    <div class="input-group">
                      <span id="joiningPrepend" class="input-group-addon">Joining Date</span>
                      <input id="joining" name="joining" class="form-control" placeholder="dd-mm-yyyy" type="date">
                      
                    </div>
                    
                  </div>
                </div>
                
                <!-- Prepended text http://getbootstrap.com/components/#input-groups -->
                <div class="form-group">
                  <label class="control-label col-sm-4" for="leaving"></label>
                  <div class="col-sm-4">
                    <div class="input-group">
                      <span id="leavingPrepend" class="input-group-addon">Leaving Date</span>
                      <input id="leaving" name="leaving" class="form-control" placeholder="dd-mm-yyyy" type="date">
                      
                    </div>
                    
                  </div>
                </div>
                
                <!-- Button Group http://getbootstrap.com/components/#btn-groups -->
                <div class="form-group">
                  <label class="control-label col-sm-4"></label>
                  <div class="text-center col-sm-4">
                    <div id="resetGroup" class="btn-group" role="group" aria-label="">
                      <button type="reset" id="reset" name="reset" class="btn btn-default" aria-label="Reset">Reset</button>
                      <button type="submit" id="submit" name="submit" class="btn btn-info" aria-label="submit">Submit</button>
                    </div>
                    
                  </div>
                </div>
                
                
                </fieldset>
                </form>
                
</body>
</html>