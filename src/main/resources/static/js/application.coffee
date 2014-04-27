require.config {
  paths : {
    jquery: '//ajax.googleapis.com/ajax/libs/jquery/2.1.0/jquery.min',
    ember: '/js/bower_components/ember/ember.js'
  },
  waitSeconds: 15
}


require ['jquery'], (jquery, ember) ->
  $(document).ready ->
    $('p').on 'click', ->
      $(this).text "gatin!"