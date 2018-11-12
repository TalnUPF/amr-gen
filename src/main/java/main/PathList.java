package main;

import gen.Hyperparams;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * Static class containing paths to files required by the generator.
 */
public class PathList
{
	public static void initializePaths(Path resources)
	{
		TRAINING_DIR = resources.resolve(Paths.get(TRAINING_DIR)).toAbsolutePath().toString();
		DEVELOPMENT_DIR = resources.resolve(Paths.get(DEVELOPMENT_DIR)).toAbsolutePath().toString();
		TEST_DIR = resources.resolve(Paths.get(TEST_DIR)).toAbsolutePath().toString();
		POS_TAGGER_PATH = resources.resolve(Paths.get(POS_TAGGER_PATH)).toAbsolutePath().toString();
		LANGUAGE_MODEL_PATH = resources.resolve(Paths.get(LANGUAGE_MODEL_PATH)).toAbsolutePath().toString();
		POS_MAXENT_PATH = resources.resolve(Paths.get(POS_MAXENT_PATH)).toAbsolutePath().toString();
		DENOM_MAXENT_PATH = resources.resolve(Paths.get(DENOM_MAXENT_PATH)).toAbsolutePath().toString();
		NUMBER_MAXENT_PATH = resources.resolve(Paths.get(NUMBER_MAXENT_PATH)).toAbsolutePath().toString();
		TENSE_MAXENT_PATH = resources.resolve(Paths.get(TENSE_MAXENT_PATH)).toAbsolutePath().toString();
		VOICE_MAXENT_PATH = resources.resolve(Paths.get(VOICE_MAXENT_PATH)).toAbsolutePath().toString();
		REORDER_MAXENT_PATH = resources.resolve(Paths.get(REORDER_MAXENT_PATH)).toAbsolutePath().toString();
		LEFT_REORDER_MAXENT_PATH = resources.resolve(Paths.get(LEFT_REORDER_MAXENT_PATH)).toAbsolutePath().toString();
		RIGHT_REORDER_MAXENT_PATH = resources.resolve(Paths.get(RIGHT_REORDER_MAXENT_PATH)).toAbsolutePath().toString();
		ARG_INSERTION_MAXENT_PATH = resources.resolve(Paths.get(ARG_INSERTION_MAXENT_PATH)).toAbsolutePath().toString();
		OTHERS_INSERTION_MAXENT_PATH = resources.resolve(Paths.get(OTHERS_INSERTION_MAXENT_PATH)).toAbsolutePath().toString();
		CHILD_INSERTION_MAXENT_PATH = resources.resolve(Paths.get(CHILD_INSERTION_MAXENT_PATH)).toAbsolutePath().toString();
		FIRST_STAGE_MAXENT_PATH = resources.resolve(Paths.get(FIRST_STAGE_MAXENT_PATH)).toAbsolutePath().toString();
		REALIZE_MAXENT_PATH = resources.resolve(Paths.get(REALIZE_MAXENT_PATH)).toAbsolutePath().toString();
		VERBALIZATION_PATH = resources.resolve(Paths.get(VERBALIZATION_PATH)).toAbsolutePath().toString();
		MORPH_VERBALIZATION_PATH = resources.resolve(Paths.get(MORPH_VERBALIZATION_PATH)).toAbsolutePath().toString();
		BESTPOSTAGS_PATH = resources.resolve(Paths.get(BESTPOSTAGS_PATH)).toAbsolutePath().toString();
		CONCEPT_LIST = resources.resolve(Paths.get(CONCEPT_LIST)).toAbsolutePath().toString();
		MERGEMAP_PATH = resources.resolve(Paths.get(MERGEMAP_PATH)).toAbsolutePath().toString();
		NAMED_ENTITIES_MAP = resources.resolve(Paths.get(NAMED_ENTITIES_MAP)).toAbsolutePath().toString();
		HYPERPARAMS_LIST = resources.resolve(Paths.get(HYPERPARAMS_LIST)).toAbsolutePath().toString();
	}

    /**
     * path to the directory which contains all AMR graphs used for training. Note that these AMR graphs are not to be stored
     * directly in the TRAINING_DIR, but instead inside the subdirectories specified by {@link PathList#AMR_SUBDIRECTORIES}.
     */
    public static String TRAINING_DIR = "corpus/training/";

    /**
     * path to the directory which contains all development AMR graphs. Note that these AMR graphs are not to be stored
     * directly in the DEVELOPMENT_DIR, but instead inside the subdirectories specified by {@link PathList#AMR_SUBDIRECTORIES}.
     */
    public static String DEVELOPMENT_DIR = "corpus/dev/";

    /**
     * path to the directory which contains all AMR graphs used for testing. Note that these AMR graphs are not to be stored
     * directly in the TEST_DIR, but instead inside the subdirectories specified by {@link PathList#AMR_SUBDIRECTORIES}.
     */
    public static String TEST_DIR = "corpus/test/";

    /**
     * subdirectories of the directories containing training, development and test AMR graphs
     */
    public static List<String> AMR_SUBDIRECTORIES = Arrays.asList("bolt/", "consensus/", "dfa/", "proxy/", "xinhua/");

    /**
     * the names of the files which contain the actual AMR graphs. Each subdirectory (see {@link PathList#AMR_SUBDIRECTORIES}) must
     * contain a file with this name.
     */
    public static final String AMR_FILENAME = "data.amr.tok.aligned";

    /**
     * the names of the files which contain the POS tags corresponding to the reference realizations of the AMR graphs stored
     * in file {@link PathList#AMR_FILENAME}. Each subdirectory (see {@link PathList#AMR_SUBDIRECTORIES}) must
     * contain a file with this name if the AMR graphs are to be used for training.
     */
    public static final String POS_FILENAME = "pos.txt";

    /**
     * the names of the files which contain the dependency trees corresponding to the reference realizations of the AMR graphs
     * stored in file {@link PathList#AMR_FILENAME}. Each subdirectory (see {@link PathList#AMR_SUBDIRECTORIES}) must
     * contain a file with this name if the AMR graphs are to be used for training.
     */
    public static final String DEPENDENCIES_FILENAME = "data.sent.tok.charniak.parse.dep";

    /**
     * the names of the files which contain the EM alignments corresponding to the reference realizations of the AMR graphs stored
     * in file {@link PathList#AMR_FILENAME}. Each subdirectory (see {@link PathList#AMR_SUBDIRECTORIES}) must
     * contain a file with this name if the AMR graphs are to be used for training.
     */
    public static final String EM_ALIGNMENTS_FILENAME = "alignments.txt";

    /**
     * path to the {@link edu.stanford.nlp.tagger.maxent.MaxentTagger} file to be used for POS tagging
     */
    public static  String POS_TAGGER_PATH = "res/english-bidirectional-distsim.tagger";

    /**
     * path to the {@link edu.berkeley.nlp.lm.ArrayEncodedNgramLanguageModel} file to be used for scoring sentences
     */
    public static  String LANGUAGE_MODEL_PATH = "res/lm.binary";

    /**
     * path to the parts of speech (POS) maximum entropy model to be used by the generator
     */
    public static  String POS_MAXENT_PATH = "models/pos.model";

    /**
     * path to the denominator maximum entropy model to be used by the generator
     */
    public static  String DENOM_MAXENT_PATH = "models/denom.model";

    /**
     * path to the number maximum entropy model to be used by the generator
     */
    public static  String NUMBER_MAXENT_PATH = "models/number.model";

    /**
     * path to the tense maximum entropy model to be used by the generator
     */
    public static  String TENSE_MAXENT_PATH = "models/tense.model";

    /**
     * path to the voice maximum entropy model to be used by the generator
     */
    public static  String VOICE_MAXENT_PATH = "models/voice.model";

    /**
     * path to the &lt;<sub>*</sub> reordering maximum entropy model to be used by the generator (see Eq. 19, Section 4.2.1 Modeling)
     */
    public static  String REORDER_MAXENT_PATH = "models/reorder.model";

    /**
     * path to the &lt;<sub>l</sub> reordering maximum entropy model to be used by the generator (see Eq. 19, Section 4.2.1 Modeling)
     */
    public static  String LEFT_REORDER_MAXENT_PATH = "models/reorder_left.model";

    /**
     * path to the &lt;<sub>r</sub> reordering maximum entropy model to be used by the generator (see Eq. 19, Section 4.2.1 Modeling)
     */
    public static  String RIGHT_REORDER_MAXENT_PATH = "models/reorder_right.model";

    /**
     * path to the INSERT-BEFORE maximum entropy model to be used by the generator for edges whose label matches :ARG[0-9]
     */
    public static  String ARG_INSERTION_MAXENT_PATH = "models/arg_insertion.model";

    /**
     * path to the INSERT-BEFORE maximum entropy model to be used by the generator for edges whose label does not match :ARG[0-9]
     */
    public static  String OTHERS_INSERTION_MAXENT_PATH = "models/others_insertion.model";

    /**
     * path to the INSERT-CHILD maximum entropy model to be used by the generator
     */
    public static  String CHILD_INSERTION_MAXENT_PATH =  "models/child_ins.bin.gz";

    /**
     * path to the first stage maximum entropy model to be used by the generator
     */
    public static  String FIRST_STAGE_MAXENT_PATH =  "models/first_stage.model";

    /**
     * path to the REALIZE maximum entropy model to be used by the generator
     */
    public static  String REALIZE_MAXENT_PATH = "models/realize.bin.gz";

    /**
     * path to the map containing verbalizations like (developer → (person (:ARG1-of develop-02))).
     * The default version of this map is extracted from http://amr.isi.edu/download/lists/verbalization-list-v1.06.txt
     */
    public static  String VERBALIZATION_PATH = "res/verbalization.txt";

    /**
     * path to the map containing corresponding noun pairs like (accept → acceptance).
     * The default version of this map is extracted from http://amr.isi.edu/download/lists/morph-verbalization-v1.01.txt
     */
    public static  String MORPH_VERBALIZATION_PATH = "res/morph-verbalization.txt";

    /**
     * path to a map containing the most frequently observed POS tag for each concept that is not a PropBank frameset
     */
    public static  String BESTPOSTAGS_PATH = "res/bestpostags.txt";

    /**
     * path to a list containing all (concept,POS tag) pairs observed in the training corpus
     */
    public static  String CONCEPT_LIST = "res/concepts.txt";

    /**
     * path to a map containing (parent,child) pairs and the result of merging them
     */
    public static  String MERGEMAP_PATH = "res/mergemap.txt";

    /**
     * paths to a map mapping all realizations for named entities to the number of times they have been observed in the training corpus
     */
    public static  String NAMED_ENTITIES_MAP = "res/namedentities.txt";

    /**
     * path to a list containing the values for all hyperparameters in the order specified in {@link Hyperparams}
     */
    public static  String HYPERPARAMS_LIST = "res/hyperparams.txt";

}