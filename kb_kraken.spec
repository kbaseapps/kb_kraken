/*
A KBase module: kb_kraken
*/

module kb_kraken {
    /*
        Insert your typespec information here.
    */

    typedef structure {
        string workspace_name;
        string input_reads_name;  /* readsLibrary or readsSet */
        string output_tax_profile_name;  /* output tax profile object */
    } RunKrakenParams;
    
    typedef structure {
        string report_name;
        string report_ref;
    } RunKrakenOutput;
    
    funcdef run_kraken (RunKrakenParams params) returns (RunKrakenOutput output) authentication required;
    
};
