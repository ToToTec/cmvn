#!/bin/sh

CMVN_PACK=cmvn-src-0.1.3
RELEASE_DIR=source-release
CMVN_DIR=${RELEASE_DIR}/${CMVN_PACK}

mkdir -p ${RELEASE_DIR}

svn export . ${CMVN_DIR}

rm -r ${CMVN_DIR}/releases

( cd ${RELEASE_DIR} && zip -r ${CMVN_PACK}.zip ${CMVN_PACK} )
