---
title: "Robust and Reproducible Research"
date: 2025-04-30
tags: ["Reproducibility","Academic research","Data creation","Experimental setting","Evaluation"]
author: "Federico Ruggeri"
description: "This PhD course introduces and discusses the concept of 'reproducibility' in research." 
summary: "This PhD course introduces and discusses the concept of 'reproducibility' in research. It focuses on data curation, experimental setup, model comparison, and programming best practices." 
cover:
    image: "course1.png"
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

+ [Garcia et al., 2021](https://www.science.org/doi/epdf/10.1126/sciadv.abd1705) – Nonreplicable publications are cited more than replicable ones.
+ [Baker 2016](https://www.nature.com/articles/533452a) - 1,500 scientists lift the lid on reproducibility.
+ [Pineau et al., 2020](https://www.jmlr.org/papers/volume22/20-303/20-303.pdf) - Improving Reproducibility in Machine Learning Research.
+ [Raff, 2019](https://proceedings.neurips.cc/paper_files/paper/2019/file/c429429bf1f2af051f2021dc92a8ebea-Paper.pdf) - A Step Toward Quantifying Independently Reproducible Machine Learning Research.
+ [Leonelli, 2023](https://www.cambridge.org/core/elements/philosophy-of-open-science/0D049ECF635F3B676C03C6868873E406) - Philosophy of Open Science.
+ [Edwards and Roy, 2017](https://pubmed.ncbi.nlm.nih.gov/28115824/) - Academic Research in the 21st Century: Maintaining Scientific Integrity in a Climate of Perverse Incentives and Hypercompetition.
+ [Allison et al., 2016](https://www.nature.com/articles/530027a) - Reproducibility: A tragedy of errors.
+ [McNutt, 2014](https://www.science.org/doi/epdf/10.1126/science.1250475) - Reproducibility.
+ [Stodden and Miguez, 2013](https://papers.ssrn.com/sol3/papers.cfm?abstract_id=2322276) - Best Practices for Computational Science: Software Infrastructure and Environments for Reproducible and Extensible Research.
+ [Kapoor and Naranayan, 2023](https://www.sciencedirect.com/science/article/pii/S2666389923001599) - Leakage and the reproducibility crisis in machine-learning-based science.
+ [Bouthillier et al., 2019](https://proceedings.mlr.press/v97/bouthillier19a/bouthillier19a.pdf) - Unreproducible Research is Reproducible.

## Part 2: Data collection and Annotation

Reproducibility can target different aspects of the research pipeline.
From the conceptualization of ideas to collecting resources and doing experiments.
We cover several aspects of data collection since it often represents the backbone of most produced machine learning research.
In particular, we cover annotation paradigms, requirements for collecting and annotating data, issues and risks when collecting data, and evaluating annotation quality.

##### Lecture recordings

+ [Lecture 3](https://zenodo.org/records/15622351) – Data Collection and Annotation.

##### Readings

+ [Liao et al., 2021](https://datasets-benchmarks-proceedings.neurips.cc/paper_files/paper/2021/file/757b505cfd34c64c85ca5b5690ee5293-Paper-round2.pdf) - Are We Learning Yet? A Meta-Review of Evaluation Failures Across Machine Learning.
+ [Röttger et al., 2022](https://aclanthology.org/2022.naacl-main.13/) - Two Contrasting Data Annotation Paradigms for Subjective NLP Tasks.
+ [Cabitza et al., 2023](https://ojs.aaai.org/index.php/AAAI/article/view/25840) - Toward a Perspectivist Turn in Ground Truthing for Predictive Computing.
+ [Ruggeri et al., 2025](https://arxiv.org/abs/2406.14099v2) - Let Guidelines Guide You: A Prescriptive Guideline-Centered Data Annotation Methodology.
+ [Paullada et al., 2021](https://www.sciencedirect.com/science/article/pii/S2666389921001847) - Data and its (dis)contents: A survey of dataset development and use in machine learning research.
+ [Koch et al., 2021](https://datasets-benchmarks-proceedings.neurips.cc/paper/2021/file/3b8a614226a953a8cd9526fca6fe9ba5-Paper-round2.pdf) - Reduced, Reused and Recycled: The Life of a Dataset in Machine Learning Research.
+ [Geva et al., 2019](https://aclanthology.org/D19-1107.pdf) - Are We Modeling the Task or the Annotator? An Investigation of Annotator Bias in Natural Language Understanding Datasets.

## Part 3: Modeling and Experimenting

There are other aspects of a machine learning pipeline where talking about reproducibility is essential: modeling, experimenting, and evaluation.
We talk about data partitioning, data leakage, random seeding, performance comparison, and metrics.

##### Lecture recordings

+ [Lecture 4](https://zenodo.org/records/15622404) – Modeling and Experimenting.

##### Readings



## Part 4: Responsible Research

## Part 5: Programming Best Practices

## Part 6: Cinnamon, a lightweight python library for research 

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
