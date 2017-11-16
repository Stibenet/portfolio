        /*********** BANNERS ************/
        $( document ).ready(function() {
            $('#banner').click(function(){

                $.ajax({
                    url:'http://localhost:8080/knowledge/findById/'+ 1,
                    type:'GET',
                    success: function(data){
                        console.log(data);
                        $('#nameBanner2').html(
							data.nameKnowledge + "<br>" +
							data.periodStudy + "<br>"
						);
                    },
                    error: function(xhr,textStatus){
                        if(xhr.status=="500")
                            $('#result_request').html("<H1 style='color:red'>Error</H1>");
                        else $('#result_request').html("<H1 style='color:red'>Not found</H1>");
                    }

                })
            })
        });
        $( document ).ready(function() {
            $('#banner').click(function(){

                $.ajax({
                    url:'http://localhost:8080/knowledge/findById/'+ 2,
                    type:'GET',
                    success: function(data){
                        console.log(data);
                        $('#nameBanner3').html(
							data.nameKnowledge + "<br>" +
							data.periodStudy + "<br>"
						);
                    },
                    error: function(xhr,textStatus){
                        if(xhr.status=="500")
                            $('#result_request').html("<H1 style='color:red'>Error</H1>");
                        else $('#result_request').html("<H1 style='color:red'>Not found</H1>");
                    }

                })
            })
        });
        $( document ).ready(function() {
            $('#banner').click(function(){

                $.ajax({
                    url:'http://localhost:8080/knowledge/findById/'+ 3,
                    type:'GET',
                    success: function(data){
                        console.log(data);
                        $('#nameBanner1').html(
							data.nameKnowledge + "<br>" +
							data.periodStudy + "<br>"
						);
                    },
                    error: function(xhr,textStatus){
                        if(xhr.status=="500")
                            $('#result_request').html("<H1 style='color:red'>Error</H1>");
                        else $('#result_request').html("<H1 style='color:red'>Not found</H1>");
                    }

                })
            })
        });
        $( document ).ready(function() {
            $('#banner').click(function(){

                $.ajax({
                    url:'http://localhost:8080/knowledge/findById/'+ 4,
                    type:'GET',
                    success: function(data){
                        console.log(data);
                        $('#nameBanner4').html(
							data.nameKnowledge + "<br>" +
							data.periodStudy + "<br>"
						); 
                    },
                    error: function(xhr,textStatus){
                        if(xhr.status=="500")
                            $('#result_request').html("<H1 style='color:red'>Error</H1>");
                        else $('#result_request').html("<H1 style='color:red'>Not found</H1>");
                    }

                })
            })
        });
        /*********** END BANNERS ************/