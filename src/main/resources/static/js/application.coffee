require.config {
  paths: {
    jquery: '/js/bower_components/jquery/dist/jquery'
    handlebars: '/js/bower_components/handlebars/handlebars'
    emberData: '/js/bower_components/ember-data/ember-data'
    ember: '/js/bower_components/ember/ember'
  },
  shim: {
    emberData: {
      deps: ['jquery','ember']
    }
  }
  waitSeconds: 20
}


require ['jquery', 'handlebars', 'emberData', 'ember'], ->

  App = Ember.Application.create {
    VERSION: '0.0.1'
    LOG_TRANSITIONS: true
  }

  App.ApplicationAdapter = DS.RESTAdapter.extend()

  App.Author = DS.Model.extend {
    name: DS.attr 'string'
    bio: DS.attr 'string'
    posts: DS.hasMany 'post'
  }

  App.Post = DS.Model.extend {
    title: DS.attr 'string'
    date: DS.attr 'date'
    content: DS.attr 'string'
    author: DS.belongsTo 'author'
  }

  App.ApplicationRoute = Ember.Route.extend {
    model : ->
      allPosts = this.store.findAll('post')

      return {
        posts: allPosts
      }
  }

  App.ApplicationController = Ember.Controller.extend {
  }

  App.IndexController = Ember.Controller.extend {
    'applicationTitle': 'Codex Arcana',
    'blogTitle': 'Codex Arcana',
    'blogDescription': 'Symbolic expressions in my head and programming languages. Also random stuff.'
    'hello': 'Hello, World!'
  }

  return
