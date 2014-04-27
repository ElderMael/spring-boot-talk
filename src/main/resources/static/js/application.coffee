require.config {
  paths: {
    jquery: '/js/bower_components/jquery/dist/jquery',
    handlebars: '/js/bower_components/handlebars/handlebars',
    ember: '/js/bower_components/ember/ember'
  },
  waitSeconds: 15
}


require ['jquery', 'handlebars', 'ember'], (app) ->

  App = Ember.Application.create({
    VERSION: '0.0.1',
    LOG_TRANSITIONS: true
  })

  App.ApplicationController = Ember.Controller.extend {
    'applicationTitle': 'Codex Arcana'
  }

  App.IndexController = Ember.Controller.extend {
    'hello': 'Codex Arcana'
  }

  return
