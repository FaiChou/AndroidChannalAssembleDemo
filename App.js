import React, {Component} from 'react';
import {StyleSheet, Text, View} from 'react-native';
import AppInfo from './AppInfo';

export default class App extends Component{
  render() {
    return (
      <View style={styles.container}>
        <Text>{`flavor: ${AppInfo.flavorName}`}</Text>
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#F5FCFF',
  },
});
