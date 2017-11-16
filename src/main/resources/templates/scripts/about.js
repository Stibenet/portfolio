	    $( document ).ready(function() {
            $('#more').click(function(){

                $.ajax({
                    url:'http://localhost:8080/about/findById/'+ 1,
                    type:'GET',
                    success: function(data){
                        console.log(data);
                        $('#description').html(
							data.description
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