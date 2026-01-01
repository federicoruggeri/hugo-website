---
title: "Robust and Reproducible Research"
date: 2025-04-30
tags: ["Reproducibility","Academic research","Data creation","Experimental setting","Evaluation"]
author: "Federico Ruggeri"
description: "This PhD course introduces and discusses the concept of 'reproducibility' in research." 
summary: "This PhD course introduces and discusses the concept of 'reproducibility' in research. It focuses on data curation, experimental setup, model comparison, and programming best practices." 
cover:
    image: "r3.jpg"
    alt: "Robust and Reproducible Research"
    relative: true
editPost:
    URL: "https://github.com/federicoruggeri/phdlectures-r3"
    Text: "Course portal"
showToc: true
disableAnchoredHeadings: false

---

## Course Repository

The official course repository containing all the relevant material (slides, recordings, images, etc..) is: https://github.com/federicoruggeri/phdlectures-r3

## Introduction

The number of scientific articles published in Computer Science (and similar fields) increases steadily every year. This is mainly due to breakthroughs like Deep Learning, and, more recently, Large Language Models.

Paradoxically, researchers are struggling even more to reproduce published research. This issue affects all possible aspects of research, including methodology, data curation, approach comparison, and implementation.

In this course, we'll introduce and discuss the concept of 'reproducibility' in research. In particular, we'll overview current issues in research and existing attempts to address them. We'll focus on data curation, experimental setup, model comparison, and programming best practices.

This course is recommended for all types of researchers, from those who have just embarked on their journey to those who have always wondered how certain research managed to get published. See Section Prerequisites for more details.

## Part 1: Reproducibility in Research

We discuss the current risks in doing research nowadays, characterized by non-reproducible findings, non publicly available resources (e.g., data, code, artifacts), an incredible and non-sustainable urge of publishing large amounts of papers in short time.
In this world, either as an aspiring or experience researcher, would you accept (trust) a work that (i) doesn't provide sufficient information for reproducibility; (ii) doesn't provide any code; (iii) doesn't provide the data/guidelines for collecting their contributing dataset; (iv) doesn't provide training details like model hyper-parameters and data partitioning.

##### Lecture recordings

+ [Lecture 1](https://zenodo.org/records/15622312) – Reproducibility in Research (Pt. I).
+ [Lecture 2](https://zenodo.org/records/15622333) - Reproducibility in Research (Pt. II).


##### Readings

+ [Stodden and Miguez, 2013](https://papers.ssrn.com/sol3/papers.cfm?abstract_id=2322276) - Best Practices for Computational Science: Software Infrastructure and Environments for Reproducible and Extensible Research.
+ [McNutt, 2014](https://www.science.org/doi/epdf/10.1126/science.1250475) - Reproducibility.
+ [Allison et al., 2016](https://www.nature.com/articles/530027a) - Reproducibility: A tragedy of errors.
+ [Baker 2016](https://www.nature.com/articles/533452a) - 1,500 scientists lift the lid on reproducibility.
+ [Edwards and Roy, 2017](https://pubmed.ncbi.nlm.nih.gov/28115824/) - Academic Research in the 21st Century: Maintaining Scientific Integrity in a Climate of Perverse Incentives and Hypercompetition.
+ [Raff, 2019](https://proceedings.neurips.cc/paper_files/paper/2019/file/c429429bf1f2af051f2021dc92a8ebea-Paper.pdf) - A Step Toward Quantifying Independently Reproducible Machine Learning Research.
+ [Bouthillier et al., 2019](https://proceedings.mlr.press/v97/bouthillier19a/bouthillier19a.pdf) - Unreproducible Research is Reproducible.
+ [Pineau et al., 2020](https://www.jmlr.org/papers/volume22/20-303/20-303.pdf) - Improving Reproducibility in Machine Learning Research.
+ [Garcia et al., 2021](https://www.science.org/doi/epdf/10.1126/sciadv.abd1705) – Nonreplicable publications are cited more than replicable ones.
+ [Leonelli, 2023](https://www.cambridge.org/core/elements/philosophy-of-open-science/0D049ECF635F3B676C03C6868873E406) - Philosophy of Open Science.
+ [Kapoor and Naranayan, 2023](https://www.sciencedirect.com/science/article/pii/S2666389923001599) - Leakage and the reproducibility crisis in machine-learning-based science.


## Part 2: Data collection and Annotation

Reproducibility can target different aspects of the research pipeline.
From the conceptualization of ideas to collecting resources and doing experiments.
We cover several aspects of data collection since it often represents the backbone of most produced machine learning research.
In particular, we cover annotation paradigms, requirements for collecting and annotating data, issues and risks when collecting data, and evaluating annotation quality.

##### Lecture recordings

+ [Lecture 3](https://zenodo.org/records/15622351) – Data Collection and Annotation.

##### Readings

+ [Geva et al., 2019](https://aclanthology.org/D19-1107.pdf) - Are We Modeling the Task or the Annotator? An Investigation of Annotator Bias in Natural Language Understanding Datasets.
+ [Liao et al., 2021](https://datasets-benchmarks-proceedings.neurips.cc/paper_files/paper/2021/file/757b505cfd34c64c85ca5b5690ee5293-Paper-round2.pdf) - Are We Learning Yet? A Meta-Review of Evaluation Failures Across Machine Learning.
+ [Paullada et al., 2021](https://www.sciencedirect.com/science/article/pii/S2666389921001847) - Data and its (dis)contents: A survey of dataset development and use in machine learning research.
+ [Koch et al., 2021](https://datasets-benchmarks-proceedings.neurips.cc/paper/2021/file/3b8a614226a953a8cd9526fca6fe9ba5-Paper-round2.pdf) - Reduced, Reused and Recycled: The Life of a Dataset in Machine Learning Research.
+ [Röttger et al., 2022](https://aclanthology.org/2022.naacl-main.13/) - Two Contrasting Data Annotation Paradigms for Subjective NLP Tasks.
+ [Cabitza et al., 2023](https://ojs.aaai.org/index.php/AAAI/article/view/25840) - Toward a Perspectivist Turn in Ground Truthing for Predictive Computing.
+ [Ruggeri et al., 2025](https://arxiv.org/abs/2406.14099v2) - Let Guidelines Guide You: A Prescriptive Guideline-Centered Data Annotation Methodology.

## Part 3: Modeling and Experimenting

There are other aspects of a machine learning pipeline where talking about reproducibility is essential: modeling, experimenting, and evaluation.
We talk about data partitioning, data leakage, random seeding, performance comparison, and metrics.

##### Lecture recordings

+ [Lecture 4](https://zenodo.org/records/15622404) – Modeling and Experimenting.

##### Readings

+ [Blagec et al., 2008](https://arxiv.org/pdf/2008.02577) - A critical analysis of metrics used for measuring progress in artificial intelligence.
+ [Henderson et al., 2018](https://aaai.org/papers/11694-deep-reinforcement-learning-that-matters/) - Deep Reinforcement Learning That Matters.
+ [Dror et al., 2018](https://aclanthology.org/P18-1128.pdf) - The Hitchhiker’s Guide to Testing Statistical Significance in Natural Language Processing.
+ [Gorman and Bedrick, 2019](https://aclanthology.org/P19-1267.pdf) - We need to talk about standard splits.
+ [Amrhein et al., 2019](https://www.nature.com/articles/d41586-019-00857-9) - Scientists rise up against statistical significance.
+ [Forde and Paganini, 2019](https://arxiv.org/pdf/1904.10922) - The Scientific Method in the Science of Machine Learning.
+ [Hovy and Prabhumoye, 2020](https://compass.onlinelibrary.wiley.com/doi/epdf/10.1111/lnc3.12432) - Five sources of bias in natural language processing.
+ [Azer et al., 2020](https://aclanthology.org/2020.acl-main.506.pdf) - Not All Claims are Created Equal: Choosing the Right Statistical Approach to Assess Hypotheses.
+ [Dehghani et al., 2021](https://arxiv.org/pdf/2107.07002) - The Benchmark Lottery.
+ [Søgaard et al., 2021](https://aclanthology.org/2021.eacl-main.156v2.pdf) - We need to Talk About Random Splits.
+ [Rob van der Goot, 2021](https://aclanthology.org/2021.emnlp-main.368.pdf) - We Need to Talk About train-dev-test Splits.
+ [Bethard, 2021](https://arxiv.org/pdf/2210.13393) - We need to talk about random seeds.
+ [Marie et al., 2021](https://aclanthology.org/2021.acl-long.566.pdf) - Scientific Credibility of Machine Translation Research: A Meta-Evaluation of 769 Papers.
+ [Kapoor and Naranayan, 2023](https://www.sciencedirect.com/science/article/pii/S2666389923001599) - Leakage and the reproducibility crisis in machine-learning-based science.
+ [Lones, 2024](https://arxiv.org/pdf/2108.02497) - How to avoid machine learning pitfalls: a guide for academic researchers.

## Part 4: Responsible Research

While there are several issues we might encounter concerning reproducibility, there is also effort in developing solutions to mitigate these issues.
One of these solutions in accordance with reproducible research is represented by recommendations checklists.

##### Lecture recordings

+ [Lecture 5](https://zenodo.org/records/15622408) – Responsible Research.

##### Readings

+ [Arnold et al., 2019](https://ieeexplore.ieee.org/document/8843893) - FactSheets: Increasing trust in AI services through supplier's declarations of conformity.
+ [Mitchell et al., 2019](https://dl.acm.org/doi/10.1145/3287560.3287596) - Model Cards for Model Reporting.
+ [Gebru et al., 2021](https://cacm.acm.org/research/datasheets-for-datasets/) - Datasheets for Datasets.
+ [Pushkarna et al., 2022](https://dl.acm.org/doi/pdf/10.1145/3531146.3533231) - Data Cards: Purposeful and Transparent Dataset Documentation for Responsible AI.
+ [Kapoor and Naranayan, 2023](https://www.sciencedirect.com/science/article/pii/S2666389923001599) - Leakage and the reproducibility crisis in machine-learning-based science.
+ [Mancini et al., 2025](https://dl.acm.org/doi/10.1613/jair.1.16406) - Promoting the Responsible Development of Speech Datasets for Mental Health and Neurological Disorders Research.

## Part 5: Programming Best Practices

Whether you like it or not, experimental setting might require you to do some coding stuff.

Coding translates to:

- Transparency (don't you dare do some cheap tricks!)
- Correctness (your code should reflect your paper statements)
- Readability (please, don't make this a nightmare)
- Efficiency (time is money)
- Maintainability (I'm sure you'll re-use this code)

##### Lecture recordings

+ [Lecture 6](https://zenodo.org/records/15622426) – Programming Best Practices (Pt. I).
+ [Lecture 7](https://zenodo.org/records/15622430) – Programming Best Practices (Pt. II).

##### Readings

+ [The Theory of Type Hints](https://peps.python.org/pep-0483/)
+ [The state of type hints in Python](https://bernat.tech/posts/the-state-of-type-hints-in-python/)
+ [The Correct Way to Overload Functions in Python](https://martinheinz.dev/blog/50)
+ [Ultimate Guide to Python Debugging](https://martinheinz.dev/blog/24)
+ [Pytest Features, That You Need in Your (Testing) Life](https://martinheinz.dev/blog/7)
+ [Making Python Programs Blazingly Fast](https://martinheinz.dev/blog/13)
+ [Optimizing Memory Usage in Python Applications](https://martinheinz.dev/blog/68)
+ [Python CLI Tricks That Don't Require Any Code Whatsoever](https://martinheinz.dev/blog/83)
+ [Profiling and Analyzing Performance of Python Programs](https://martinheinz.dev/blog/64)
+ 

## Part 6: Cinnamon, a lightweight python library for research

Cinnamon is a lightweight library for general-purpose configuration and code logic de-coupling.

##### Lecture recordings

+ [Lecture 8](https://zenodo.org/records/15622441) – Cinnamon: a lightweight python library for research.

##### Readings

+ [Cinnamon Documentation](https://nlp-unibo.github.io/cinnamon/overview.html)

## Course History

- ``2024-2025`` --> "Robust and Reproducible Research" (16 hours)
- ``2022-2023`` --> "Robust and Reproducible Experimental Deep Learning Setting" (10 hours)

## Course Info

16 Hours Lecture Format: 2 hour-long hybrid lectures.

## Prerequisites

Lectures are meant to be interactive.

- **Programming**: Intermediate
- **Deep Learning** Theory: Intermediate
- **Jupyter Notebook**: Beginner
