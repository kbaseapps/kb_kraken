# -*- coding: utf-8 -*-
#BEGIN_HEADER
#END_HEADER


class kb_kraken:
    '''
    Module Name:
    kb_kraken

    Module Description:
    A KBase module: kb_kraken
    '''

    ######## WARNING FOR GEVENT USERS #######
    # Since asynchronous IO can lead to methods - even the same method -
    # interrupting each other, you must be *very* careful when using global
    # state. A method could easily clobber the state set by another while
    # the latter method is running.
    #########################################
    VERSION = "0.0.1"
    GIT_URL = "https://github.com/kbaseapps/kb_kraken.git"
    GIT_COMMIT_HASH = "cca72ae0bb374380a6728364e7617aa52807a7da"
    
    #BEGIN_CLASS_HEADER
    #END_CLASS_HEADER

    # config contains contents of config file in a hash or None if it couldn't
    # be found
    def __init__(self, config):
        #BEGIN_CONSTRUCTOR
        #END_CONSTRUCTOR
        pass
    

    def run_kraken(self, ctx, params):
        """
        :param params: instance of type "RunKrakenParams" (Insert your
           typespec information here.) -> structure: parameter
           "workspace_name" of String, parameter "input_reads_ref" of String,
           parameter "output_tax_profile_name" of String
        :returns: instance of type "RunKrakenOutput" -> structure: parameter
           "report_name" of String, parameter "report_ref" of String
        """
        # ctx is the context object
        # return variables are: output
        #BEGIN run_kraken
        #END run_kraken

        # At some point might do deeper type checking...
        if not isinstance(output, dict):
            raise ValueError('Method run_kraken return value ' +
                             'output is not type dict as required.')
        # return the results
        return [output]

    def status(self, ctx):
        #BEGIN_STATUS
        returnVal = {'state': "OK", 'message': "", 'version': self.VERSION, 
                     'git_url': self.GIT_URL, 'git_commit_hash': self.GIT_COMMIT_HASH}
        #END_STATUS
        return [returnVal]
