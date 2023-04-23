$(document).ready(function(){
    $('#empdatatable').dataTable({
        searching:true,
        serverside:true,
        ajax: {
            'url': 'http://localhost:9091/get-all',
            'type': 'GET',
            'dataSrc':''
        },
        columns: [
            { data: 'name' },
            { data: 'position' },
            { data: 'office' },
            { data: 'age'},
            { data: 'startDate' },
            { data: 'salary',
              render: function(data){
                  return '$ '+ data
                  }
            },
            
        ],
    });
});