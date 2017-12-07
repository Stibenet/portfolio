/*********** ARTICLES ************/
        $( document ).ready(function() {
            $('#moreArticle1').click(function(){

                $.ajax({
                    url:'http://localhost:8080/work/findById/'+ 2,
                    type:'GET',
                    success: function(data){
                        console.log(data);
                        $('#name1').html(
							data.nameWork
						);
                        $('#p1').html(
                            data.descriptionWork
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
            $('#moreArticle2').click(function(){

                $.ajax({
                    url:'http://localhost:8080/work/findById/'+ 3,
                    type:'GET',
                    success: function(data){
                        console.log(data);
                        $('#name2').html(
							data.nameWork
						);
                        $('#p2').html(
                            data.descriptionWork
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
            $('#moreArticle3').click(function(){

                $.ajax({
                    url:'http://localhost:8080/work/findById/'+ 4,
                    type:'GET',
                    success: function(data){
                        console.log(data);
                        $('#name3').html(
							data.nameWork
						);
                        $('#p3').html(
                            data.descriptionWork
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
            $('#moreArticle4').click(function(){

                $.ajax({
                    url:'http://localhost:8080/work/findById/'+ 6,
                    type:'GET',
                    success: function(data){
                        console.log(data);
                        $('#name4').html(
							data.nameWork
						);
                        $('#p4').html(
                            data.descriptionWork
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
            $('#moreArticle5').click(function(){

                $.ajax({
                    url:'http://localhost:8080/work/findById/'+ 5,
                    type:'GET',
                    success: function(data){
                        console.log(data);
                        $('#name5').html(
							data.nameWork
						);
                        $('#p5').html(
                            data.descriptionWork
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
        /*********** END ARTICLES ************/